package com.romuloM.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romuloM.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
