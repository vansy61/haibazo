package org.example.testhaibazo.mapper;

import org.example.testhaibazo.model.Size;
import org.example.testhaibazo.model.dto.SizeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SizeMapper {
    SizeMapper INSTANCE = Mappers.getMapper(SizeMapper.class);

    SizeDTO sizeToSizeDTO(Size size);
}
