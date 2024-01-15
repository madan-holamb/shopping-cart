package response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApiResponse {
	
	private boolean status;
	
	private String message;
	
	@JsonInclude(Include.NON_NULL)
	private Integer code;
	
	private Object dataObject;
	
	@JsonInclude(Include.NON_NULL)
	private String token;

}
