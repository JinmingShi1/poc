package com.poc.Controller;

import com.poc.Entity.UserInfo;
import com.poc.dto.UserDTO;
import com.poc.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/users/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/getAllUser")
    public List<UserDTO> getAllUser() {
        return userService.findAll();
    }

    @PutMapping("/update/users")
    public Long updateById(@RequestBody UserInfo userInfo) {
        return userService.updateUser(userInfo);
    }

    @DeleteMapping("/delete/users/{id}")
    public Long deleteById(@PathVariable Long id) {
        return userService.deleteUserById(id);
    }
}
