package com.reign.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reign.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	// O Springdata JPA ja possui implementação padrão para interfaces que extendem de JPARepository

}