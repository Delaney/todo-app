package com.delaney.firstrest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    
    @Autowired
    UserService userService;

    @PostMapping("/user")
    User createNew(@RequestBody User user) {
        return userService.create(user);
    }
}
