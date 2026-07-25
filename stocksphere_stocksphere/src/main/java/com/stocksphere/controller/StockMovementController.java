package com.stocksphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stocksphere.entity.StockMovement;
import com.stocksphere.service.StockMovementService;

@RestController
@RequestMapping("/api/stock")
@CrossOrigin(origins = "*")
public class StockMovementController {

    @Autowired
    private StockMovementService stockMovementService;

    // Save Stock Movement
    @PostMapping
    public StockMovement saveMovement(@RequestBody StockMovement movement) {
        return stockMovementService.saveMovement(movement);
    }

    // Get All Stock Movements
    @GetMapping
    public List<StockMovement> getAllMovements() {
        return stockMovementService.getAllMovements();
    }

    // Get Stock Movement By Product Id
    @GetMapping("/product/{productId}")
    public List<StockMovement> getMovementByProduct(
            @PathVariable("productId") Long productId) {

        return stockMovementService.getMovementByProduct(productId);
    }
}