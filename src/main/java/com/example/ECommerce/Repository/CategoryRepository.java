package com.example.ECommerce.Repository;

import com.example.ECommerce.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
