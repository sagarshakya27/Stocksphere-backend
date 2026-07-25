package com.stocksphere.entity;


import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "stock_movements")
public class StockMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(nullable = false)
    private String movementType;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private String reason;

    private LocalDateTime movementDate;

    public StockMovement() {
    }

    public StockMovement(Long id, Product product, String movementType,
                         Integer quantity, String reason,
                         LocalDateTime movementDate) {
        this.id = id;
        this.product = product;
        this.movementType = movementType;
        this.quantity = quantity;
        this.reason = reason;
        this.movementDate = movementDate;
    }

    @PrePersist
    public void prePersist() {
        this.movementDate = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(LocalDateTime movementDate) {
        this.movementDate = movementDate;
    }
}