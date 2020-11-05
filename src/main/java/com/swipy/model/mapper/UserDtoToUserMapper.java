package com.swipy.model.mapper;

import com.swipy.model.dto.UserDto;
import com.swipy.model.entity.User;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDtoToUserMapper {

    UserDtoToUserMapper INSTANCE = Mappers.getMapper(UserDtoToUserMapper.class);

    User user(UserDto userDto);
    @AfterMapping
    default void setAfterMapProperties(@MappingTarget User user){

    }
}