package com.swipy.model.mapper;

import com.swipy.model.dto.ReserveDto;
import com.swipy.model.entity.Reserve;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReserveDtoToReserveMapper {
    ReserveDtoToReserveMapper INSTANCE= Mappers.getMapper(ReserveDtoToReserveMapper.class);
    @Mapping(target = "productId",ignore = true)
    @Mapping(target = "userId",ignore = true)
    Reserve reserve(ReserveDto reserveDto);
}
