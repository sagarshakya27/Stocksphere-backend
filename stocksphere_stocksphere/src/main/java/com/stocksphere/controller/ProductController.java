package com.stocksphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stocksphere.entity.Product;
import com.stocksphere.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Add Product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // Get All Products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Get Product By Id
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    // Update Product
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,
                                 @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    // Delete Product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
        return "Product Deleted Successfully";
    }
}