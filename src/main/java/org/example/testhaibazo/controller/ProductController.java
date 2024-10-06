package org.example.testhaibazo.controller;

import org.example.testhaibazo.mapper.ProductMapper;
import org.example.testhaibazo.model.Product;
import org.example.testhaibazo.model.dto.product.ProductDTO;
import org.example.testhaibazo.model.dto.product.ProductListingDTO;
import org.example.testhaibazo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping
    public ResponseEntity<Page<ProductListingDTO>> getProducts(
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) List<Long> sizeIds,
            @RequestParam(required = false) List<Long> colorIds,
            @RequestParam(required = false) Long styleId,
            Pageable pageable) {
        Page<Product> products = productService.getProducts(
                categoryId, minPrice, maxPrice, sizeIds, colorIds, styleId, pageable
        );
        Page<ProductListingDTO> productsListingDTO = products.map(ProductMapper.INSTANCE::productToProductListingDTO);
        return ResponseEntity.ok(productsListingDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        ProductDTO productDTO = ProductMapper.INSTANCE.productToProductDTO(product);
        return ResponseEntity.ok(productDTO);
    }
}
