package org.example.testhaibazo.model.dto.product;

import lombok.Data;
import org.example.testhaibazo.model.Category;
import org.example.testhaibazo.model.Image;
import org.example.testhaibazo.model.ProductSize;
import org.example.testhaibazo.model.Style;

import java.util.List;

@Data
public class ProductListingDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Double originalPrice;
    private Float rating;
    private String avatarImageUrl;
    private Category category;
    private Style style;
}
