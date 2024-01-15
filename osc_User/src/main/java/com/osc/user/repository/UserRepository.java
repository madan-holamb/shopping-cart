package com.osc.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.osc.user.entities.User;

import jakarta.transaction.Transactional;


public interface UserRepository extends JpaRepository<User, Integer> {

	public User findOneByEmail(String email);

	public User findByUserId(String userId);

	public User findByPassword(String password);
	
	@Transactional
	@Modifying
	@Query("update User u set u.password =:newPassword where u.email =:email")
	void changePassword(@Param("newPassword") String newPassword, @Param("email") String email);

}
