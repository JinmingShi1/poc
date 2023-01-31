package com.poc.Service.Impl;

import com.poc.dto.UserDTO;
import com.poc.Entity.UserInfo;
import com.poc.dao.UserDAO;
import com.poc.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public UserDTO findById(Long id) {
        return userDAO.findById(id);
    }


    @Override
    public List<UserDTO> findAll() {
        return userDAO.findAllUser();
    }

    @Override
    public Long updateUser(UserInfo userInfo) {
        return userDAO.updateUser(userInfo);
    }

    @Override
    public Long deleteUserById(Long id) {
        return userDAO.deleteUserById(id);
    }

}
