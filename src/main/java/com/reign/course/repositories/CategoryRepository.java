package com.reign.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reign.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	// O Springdata JPA ja possui implementação padrão para interfaces que extendem de JPARepository

}