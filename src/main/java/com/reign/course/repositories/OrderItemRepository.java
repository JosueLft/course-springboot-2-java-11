package com.reign.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reign.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	// O Springdata JPA ja possui implementação padrão para interfaces que extendem de JPARepository

}