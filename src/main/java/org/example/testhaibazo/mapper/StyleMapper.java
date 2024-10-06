package org.example.testhaibazo.mapper;

import org.example.testhaibazo.model.Size;
import org.example.testhaibazo.model.Style;
import org.example.testhaibazo.model.dto.SizeDTO;
import org.example.testhaibazo.model.dto.StyleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StyleMapper {
    StyleMapper INSTANCE = Mappers.getMapper(StyleMapper.class);

    StyleDTO styleToStyleDTO(Style style);
}
