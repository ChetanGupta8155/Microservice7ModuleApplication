package com.csi.service;

import com.csi.model.Users;
import com.csi.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl {
    @Autowired
    UsersRepo usersRepoImpl;

    public Users saveData(Users users){
        return usersRepoImpl.save(users);
    }

    public Optional<Users> getDataById(int userId){
        return usersRepoImpl.findById(userId);
    }
}
