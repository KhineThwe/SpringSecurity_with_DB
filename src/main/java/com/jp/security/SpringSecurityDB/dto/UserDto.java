package com.jp.security.SpringSecurityDB.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserDto {
	private Long id;

	@NotEmpty(message = "Please enter valid name.")
	private String name;

	@NotEmpty(message = "Please enter valid email.")
	@Email
	private String email;

	@NotEmpty(message = "Please enter valid password.")
	private String password;

}
//https://www.codeburps.com/post/spring-boot-form-login
