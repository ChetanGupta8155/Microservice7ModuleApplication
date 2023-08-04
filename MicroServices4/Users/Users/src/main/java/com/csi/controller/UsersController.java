package com.csi.controller;

import com.csi.model.Users;
import com.csi.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/userss")
public class UsersController {

    @Autowired
    UsersServiceImpl usersServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Users>saveData(@RequestBody Users users){
        return ResponseEntity.ok(usersServiceImpl.saveData(users));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Optional<Users>> getDataById(@PathVariable int userId){
        return ResponseEntity.ok(usersServiceImpl.getDataById(userId));
    }
}
