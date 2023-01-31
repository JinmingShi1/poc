package com.poc.Service;

import com.poc.dto.UserDTO;
import com.poc.Entity.UserInfo;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService {
    UserDTO findById(Long id);

    List<UserDTO> findAll();

    Long updateUser(UserInfo userInfo);

    Long deleteUserById(Long id);
}
