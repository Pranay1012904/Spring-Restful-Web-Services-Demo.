package com.spring.RestApi.mapper;

import com.spring.RestApi.dto.UserDto;
import com.spring.RestApi.entity.UserEntity;

public class UserMapper {

    public static UserEntity userDtoToUser(UserDto userDto){
        UserEntity user=new UserEntity(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }

    public static UserDto userToUserDto(UserEntity user){
        UserDto userDto=new UserDto(
                user.getId(),
                user.getfName(),
                user.getlName(),
                user.getEmail()
        );
        return userDto;
    }
}
