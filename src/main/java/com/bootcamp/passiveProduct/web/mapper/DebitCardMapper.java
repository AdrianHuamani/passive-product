package com.bootcamp.passiveProduct.web.mapper;
import com.bootcamp.passiveProduct.domain.DebitCard;
import com.bootcamp.passiveProduct.web.contracts.DebitCardResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DebitCardMapper {
    DebitCardMapper INSTANCE = Mappers.getMapper(DebitCardMapper.class);

    DebitCardResponse entityToResponse(DebitCard source);

    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget DebitCard entity, DebitCard updateEntity);

}
