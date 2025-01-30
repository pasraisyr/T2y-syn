package com.example.tuition.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public User signUp(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        User existingUser = userService.findByEmail(user.getUsername());
        if (existingUser != null && user.getPassword().equals(existingUser.getPassword())) {
            return existingUser;
        }
        return null;
    }
}
