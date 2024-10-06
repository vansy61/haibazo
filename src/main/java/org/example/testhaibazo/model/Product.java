package org.example.testhaibazo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private Double originalPrice;
    private Float rating;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Style style;

    @OneToMany(mappedBy = "product")
    private List<ProductSize> productSizes;

    @OneToMany(mappedBy = "product")
    @OrderBy("position ASC")
    private List<Image> images;
}