package com.stocksphere.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocksphere.entity.Category;
import com.stocksphere.repository.CategoryRepository;
import com.stocksphere.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category updateCategory(Long id, Category category) {

        Category existingCategory = categoryRepository.findById(id).orElse(null);

        if (existingCategory != null) {

            existingCategory.setCategoryName(category.getCategoryName());
            existingCategory.setDescription(category.getDescription());

            return categoryRepository.save(existingCategory);
        }

        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

}