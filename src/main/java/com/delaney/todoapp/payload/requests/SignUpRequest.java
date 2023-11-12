package com.delaney.todoapp.payload.requests;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Set;

@Data
public class SignUpRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 20)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 40)    
    private String password;
    
    private Set<String> role;
}
