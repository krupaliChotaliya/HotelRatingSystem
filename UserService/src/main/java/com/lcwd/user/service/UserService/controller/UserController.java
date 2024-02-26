package com.lcwd.user.service.UserService.controller;

import com.lcwd.user.service.UserService.Service.userService;
import com.lcwd.user.service.UserService.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private userService userService;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1=  userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUser());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
       User user1= userService.getUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body(user1);
    }

}
