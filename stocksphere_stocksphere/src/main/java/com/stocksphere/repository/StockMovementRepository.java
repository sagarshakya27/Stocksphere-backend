package com.stocksphere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocksphere.entity.StockMovement;

public interface StockMovementRepository extends JpaRepository<StockMovement, Long> {

    List<StockMovement> findByProductId(Long productId);

}