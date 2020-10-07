package com.swipy.model.mapper;

import com.swipy.model.dto.UserDto;
import com.swipy.model.entity.User;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDtoToUserMapper {
    UserDtoToUserMapper INSTANCE = Mappers.getMapper(UserDtoToUserMapper.class);
    @Mapping(target = "gender",ignore = true)
    @Mapping(target = "type",ignore = true)
    User user(UserDto userDto);
    @AfterMapping
    default void afterMap(@MappingTarget User user,UserDto userDto){
        if (userDto.getGender().equals("female")){
          user.setGender(1);
        }
       else if (userDto.getGender().equals("male")){
           user.setGender(2);
        }
       if (userDto.getType().equals("customer")){
           user.setType(1);
       }
    }
    }
