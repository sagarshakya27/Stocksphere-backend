package com.stocksphere.service;

import java.util.List;

import com.stocksphere.entity.Category;

public interface CategoryService {

    Category addCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    Category updateCategory(Long id, Category category);

    void deleteCategory(Long id);
}