package org.example.testhaibazo.service;

import org.example.testhaibazo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Product findById(Long id);

    Page<Product> getProducts(Long categoryId, Double minPrice, Double maxPrice, List<Long> sizeIds, List<Long> colorIds, Long styleId, Pageable pageable);
}
