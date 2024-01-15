package com.osc.user.security;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private Logger logger = LoggerFactory.getLogger(OncePerRequestFilter.class);
	@Autowired
	private JwtHelper jwtHelper;

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

		String requestHeader = request.getHeader("Authorization");
		//Bearer 2352345235sdfrsfgsdfsdf
		logger.info(" Header :  {}", requestHeader);
		String username = null;
		String token = null;
		if (requestHeader != null && requestHeader.startsWith("Bearer")) {
			//looking good
			token = requestHeader.substring(7);
			try {

				username = this.jwtHelper.getUsernameFromToken(token);

			} catch (IllegalArgumentException e) {
				logger.info("Illegal Argument while fetching the username !!");
				e.printStackTrace();
			} catch (ExpiredJwtException e) {
				logger.info("Given jwt token is expired !!");
				e.printStackTrace();
			} catch (MalformedJwtException e) {
				logger.info("Some changed has done in token !! Invalid Token");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();

			}


		} else {
			logger.info("Invalid Header Value !! ");
		}


		//
		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

			//fetch user detail from username
			//UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
			String body = "";


			Map<String, Object> map =  new ObjectMapper().readValue(body, HashMap.class);

			Boolean validateToken = this.jwtHelper.validateToken(token, map);
			if (validateToken) {
				/*
				 * 
				 * //set the authentication UserDetails userDetails =
				 * this.userDetailsService.loadUserByUsername("madan");
				 * UsernamePasswordAuthenticationToken authentication = new
				 * UsernamePasswordAuthenticationToken(userDetails, null,
				 * userDetails.getAuthorities()); authentication.setDetails(new
				 * WebAuthenticationDetailsSource().buildDetails(request));
				 * SecurityContextHolder.getContext().setAuthentication(authentication);
				 * 
				 * 
				 */} else {
					 logger.info("Validation fails !!");
				 }


		}

		filterChain.doFilter(request, response);


	}
	
	
/*
	String extractPostRequestBody(HttpServletRequest request) throws IOException {
		if ("POST".equalsIgnoreCase(request.getMethod())) {
			Scanner s = new Scanner(request.getInputStream(), "UTF-8").useDelimiter("\\A");
			return s.hasNext() ? s.next() : "";
		}
		return "";
	}*/

}
