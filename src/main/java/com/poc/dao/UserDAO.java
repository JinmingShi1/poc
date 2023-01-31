package com.poc.dao;

import com.poc.dto.UserDTO;
import com.poc.Entity.UserInfo;

import java.util.List;

public interface UserDAO {
    UserDTO findById(Long id);

    List<UserDTO> findAllUser();

    Long updateUser(UserInfo userInfo);

    Long deleteUserById(Long id);
}
