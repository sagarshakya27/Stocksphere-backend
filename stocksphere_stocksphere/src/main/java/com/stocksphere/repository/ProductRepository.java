package com.stocksphere.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocksphere.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryId(Long categoryId);

    List<Product> findByQuantityLessThan(Integer quantity);

}