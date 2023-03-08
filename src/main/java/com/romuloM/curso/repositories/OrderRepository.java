package com.romuloM.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romuloM.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
