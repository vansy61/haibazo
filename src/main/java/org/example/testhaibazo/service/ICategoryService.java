package org.example.testhaibazo.service;

import org.example.testhaibazo.model.Category;
import org.example.testhaibazo.model.dto.CategoryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService {
    Page<Category> getCategories(Pageable pageable);
}
