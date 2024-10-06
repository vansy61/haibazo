package org.example.testhaibazo.mapper;

import org.example.testhaibazo.model.Category;
import org.example.testhaibazo.model.Color;
import org.example.testhaibazo.model.dto.CategoryDTO;
import org.example.testhaibazo.model.dto.ColorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
