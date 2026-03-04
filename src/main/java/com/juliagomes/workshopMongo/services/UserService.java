package com.juliagomes.workshopMongo.services;

import com.juliagomes.workshopMongo.domain.User;
import com.juliagomes.workshopMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();

    }
}
