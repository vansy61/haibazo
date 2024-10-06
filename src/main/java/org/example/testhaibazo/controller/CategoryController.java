package org.example.testhaibazo.controller;

import org.example.testhaibazo.mapper.CategoryMapper;
import org.example.testhaibazo.model.Category;
import org.example.testhaibazo.model.dto.CategoryDTO;
import org.example.testhaibazo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<Page<CategoryDTO>> getCaetgories(Pageable pageable) {
        Page<Category> categories = categoryService.getCategories(pageable);
        Page<CategoryDTO> categoriesDto = categories.map(CategoryMapper.INSTANCE::categoryToCategoryDTO);
        return ResponseEntity.ok(categoriesDto);
    }

}
