package com.hms.healthcare.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginDto {

	@NotEmpty(message = "email cannot be Empty")
	@Email (message = "invalid email format")
	private String email;
	@NotEmpty (message = "Password cannot be Empty")
	private String password;
	
}
