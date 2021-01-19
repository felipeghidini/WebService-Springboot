package com.nelioalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelioalves.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
