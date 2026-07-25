package com.stocksphere.service;



import java.util.List;

import com.stocksphere.entity.StockMovement;

public interface StockMovementService {

    // Save Stock Movement
    StockMovement saveMovement(StockMovement movement);

    // Get All Stock Movements
    List<StockMovement> getAllMovements();

    // Get Stock Movement By Product Id
    List<StockMovement> getMovementByProduct(Long productId);

}