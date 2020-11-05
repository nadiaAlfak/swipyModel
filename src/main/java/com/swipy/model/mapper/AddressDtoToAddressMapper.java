package com.swipy.model.mapper;

import com.swipy.model.dto.AddressDto;
import com.swipy.model.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressDtoToAddressMapper {
    AddressDtoToAddressMapper INSTANCE = Mappers.getMapper(AddressDtoToAddressMapper.class);
    Address address(AddressDto addressDto);
}
