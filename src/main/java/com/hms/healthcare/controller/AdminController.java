package com.hms.healthcare.controller;

import java.util.Map;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity
@RequestMapping("api/v1/admin")
public class AdminController {

	@GetMapping("/check")
	@PreAuthorize("hasRole('ADMIN')")
	public Map<String,Object> login(){
		return Map.of("message", "its working");
	}
	
}
