package com.stocksphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stocksphere.entity.Category;
import com.stocksphere.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable("id") Long id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable("id") Long id,
                                   @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteCategory(id);
        return "Category Deleted Successfully";
    }
}