package org.example.testhaibazo.mapper;

import org.example.testhaibazo.model.Image;
import org.example.testhaibazo.model.Product;
import org.example.testhaibazo.model.dto.product.ProductDTO;
import org.example.testhaibazo.model.dto.product.ProductListingDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO productToProductDTO(Product product);
    @Mapping(source = "images", target = "avatarImageUrl", qualifiedByName = "mapAvatarImage")
    ProductListingDTO productToProductListingDTO(Product product);

    @Named("mapAvatarImage")
    default String mapFirstImage(List<Image> images) {
        if(images == null || images.isEmpty()) {
            return null;
        }
        return images.get(0).getUrl();
    }
}
