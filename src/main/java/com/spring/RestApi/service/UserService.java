package com.spring.RestApi.service;

import com.spring.RestApi.dto.UserDto;
import com.spring.RestApi.entity.UserEntity;

public interface UserService {
    public UserDto createUser(UserDto userDto);
    public UserDto getUserById(Long id);
}
