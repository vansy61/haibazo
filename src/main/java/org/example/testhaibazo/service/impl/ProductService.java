package org.example.testhaibazo.service.impl;

import org.example.testhaibazo.model.Product;
import org.example.testhaibazo.repository.ProductRepository;
import org.example.testhaibazo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Product> getProducts(Long categoryId, Double minPrice, Double maxPrice, List<Long> sizeIds, List<Long> colorIds, Long styleId, Pageable pageable) {
        return productRepository.filterProducts(categoryId, minPrice, maxPrice, sizeIds, colorIds, styleId, pageable);
    }

}
