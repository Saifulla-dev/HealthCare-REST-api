package com.hms.healthcare.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.hms.healthcare.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	boolean existsByEmail(String adminEmail);

	Optional<User> findByEmail(String email);
	

}
