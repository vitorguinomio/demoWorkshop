package com.vitorguinomio.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        List<User> users = repo.findAll();
        System.out.println("TOTAL USERS: " + users.size());
        return users;
    }


}
