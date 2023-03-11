package com.romuloM.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romuloM.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
