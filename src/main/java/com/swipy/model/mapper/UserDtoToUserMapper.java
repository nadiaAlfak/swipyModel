package com.swipy.model.mapper;

import com.swipy.model.dto.UserDto;
import com.swipy.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDtoToUserMapper {
    UserDtoToUserMapper INSTANCE = Mappers.getMapper(UserDtoToUserMapper.class);
    User user(UserDto userDto);
}
