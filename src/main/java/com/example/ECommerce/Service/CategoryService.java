package com.example.ECommerce.Service;

import com.example.ECommerce.Model.Category;
import com.example.ECommerce.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }


}
