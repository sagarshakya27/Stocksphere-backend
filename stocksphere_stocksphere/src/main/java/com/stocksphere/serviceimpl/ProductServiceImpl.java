package com.stocksphere.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocksphere.entity.Product;
import com.stocksphere.repository.ProductRepository;
import com.stocksphere.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Long id, Product product) {

        Product existingProduct = productRepository.findById(id).orElse(null);

        if (existingProduct != null) {

            existingProduct.setProductName(product.getProductName());
            existingProduct.setSku(product.getSku());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setLowStockThreshold(product.getLowStockThreshold());
            existingProduct.setImageUrl(product.getImageUrl());
            existingProduct.setCategory(product.getCategory());

            return productRepository.save(existingProduct);
        }

        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}