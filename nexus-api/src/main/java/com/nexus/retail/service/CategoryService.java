package com.nexus.retail.service;

import com.nexus.retail.model.Category;
import com.nexus.retail.payload.CategoryDTO;
import com.nexus.retail.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories();
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
