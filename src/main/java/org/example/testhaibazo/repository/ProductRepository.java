package org.example.testhaibazo.repository;

import org.example.testhaibazo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository  extends JpaRepository<Product, Long> {

    @Query("SELECT DISTINCT p FROM Product p "
            + "LEFT JOIN p.productSizes ps "
            + "LEFT JOIN ps.productColors pc "
            + "WHERE (:categoryId IS NULL OR p.category.id = :categoryId) AND "
            + "(:minPrice IS NULL OR p.price >= :minPrice) AND "
            + "(:maxPrice IS NULL OR p.price <= :maxPrice) AND "
            + "(:sizeIds IS NULL OR ps.size.id IN :sizeIds) AND "
            + "(:colorIds IS NULL OR pc.color.id IN :colorIds) AND "
            + "(:styleId IS NULL OR p.style.id = :styleId)")
    Page<Product> filterProducts(
            @Param("categoryId") Long categoryId,
            @Param("minPrice") Double minPrice,
            @Param("maxPrice") Double maxPrice,
            @Param("sizeIds") List<Long> sizeIds,
            @Param("colorIds") List<Long> colorIds,
            @Param("styleId") Long styleId,
            Pageable pageable
    );
}
