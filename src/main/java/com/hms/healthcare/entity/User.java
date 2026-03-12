package com.hms.healthcare.entity;

import java.time.LocalDateTime;

import com.hms.healthcare.enums.HospitalRoles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false, unique = true)
	private Long mobile;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private HospitalRoles role;
	@Column(nullable = false, updatable = false)
	private LocalDateTime createdAt;
	@Column(nullable = false)
	private boolean isActive;
	 @PrePersist
	    protected void onCreate() {
	        createdAt = LocalDateTime.now();
	    }
}
