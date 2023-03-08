package com.romuloM.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romuloM.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
