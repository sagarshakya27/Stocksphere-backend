package com.stocksphere.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocksphere.entity.StockMovement;
import com.stocksphere.repository.StockMovementRepository;
import com.stocksphere.service.StockMovementService;

@Service
public class StockMovementServiceImpl implements StockMovementService {

    @Autowired
    private StockMovementRepository stockMovementRepository;

    @Override
    public StockMovement saveMovement(StockMovement movement) {
        return stockMovementRepository.save(movement);
    }

    @Override
    public List<StockMovement> getAllMovements() {
        return stockMovementRepository.findAll();
    }

    @Override
    public List<StockMovement> getMovementByProduct(Long productId) {
        return stockMovementRepository.findByProductId(productId);
    }

}