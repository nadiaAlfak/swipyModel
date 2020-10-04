package com.swipy.model.businessLogic;

import com.swipy.model.dto.UserDto;
import com.swipy.model.entity.User;
import com.swipy.model.mapper.UserDtoToUserMapper;
import com.swipy.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserCRUD {
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserRepository userRepository;

    public boolean save(UserDto userDto){
        User user= UserDtoToUserMapper.INSTANCE.user(userDto);
        try {
            userRepository.save(user);
            return true;
        }
        catch (Exception ex){
            return false;
        }

    }



    }
