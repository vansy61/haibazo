package org.example.testhaibazo.repository;

import org.example.testhaibazo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
