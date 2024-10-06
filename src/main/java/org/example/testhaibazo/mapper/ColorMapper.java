package org.example.testhaibazo.mapper;

import org.example.testhaibazo.model.Color;
import org.example.testhaibazo.model.dto.ColorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ColorMapper {
    ColorMapper INSTANCE = Mappers.getMapper(ColorMapper.class);

    ColorDTO colorToColorDTO(Color color);
}