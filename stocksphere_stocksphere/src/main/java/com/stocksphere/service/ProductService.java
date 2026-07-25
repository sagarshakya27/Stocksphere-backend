package com.stocksphere.service;



import java.util.List;

import com.stocksphere.entity.Product;

public interface ProductService {

    // Add Product
    Product addProduct(Product product);

    // Get All Products
    List<Product> getAllProducts();

    // Get Product By Id
    Product getProductById(Long id);

    // Update Product
    Product updateProduct(Long id, Product product);

    // Delete Product
    void deleteProduct(Long id);

}