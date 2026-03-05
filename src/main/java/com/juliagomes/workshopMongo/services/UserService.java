package com.juliagomes.workshopMongo.services;

import com.juliagomes.workshopMongo.domain.User;
import com.juliagomes.workshopMongo.repository.UserRepository;
import com.juliagomes.workshopMongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();

    }

    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found! :c "));
    }




}
