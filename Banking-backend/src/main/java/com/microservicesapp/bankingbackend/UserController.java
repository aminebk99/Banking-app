package com.microservicesapp.bankingbackend;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<User> saveUsers(@RequestBody User user){
        return ResponseEntity.ok().body(userService.saveUsers(user));
    }
    @PostMapping("login")
    public ResponseEntity<String> loginUsers(@RequestBody User user){
        return ResponseEntity.ok().body(userService.LoginUsers(user));
    }
    @GetMapping()
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }
}
