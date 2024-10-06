package org.example.testhaibazo.service.impl;

import org.example.testhaibazo.model.Category;
import org.example.testhaibazo.model.dto.CategoryDTO;
import org.example.testhaibazo.repository.CategoryRepository;
import org.example.testhaibazo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> getCategories(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }
}
