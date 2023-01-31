package com.poc.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private Long id;

    private String email;
    private String phoneNum;
    private String ssn;
    private String address;
    private String city;
}
