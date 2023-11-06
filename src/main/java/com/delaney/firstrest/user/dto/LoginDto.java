package com.delaney.firstrest.user.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String password;    
}
