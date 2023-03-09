package com.romuloM.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romuloM.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
