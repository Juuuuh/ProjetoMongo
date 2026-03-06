package com.juliagomes.workshopMongo.services;

import com.juliagomes.workshopMongo.domain.Post;
import com.juliagomes.workshopMongo.repository.PostRepository;
import com.juliagomes.workshopMongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PostService {
    @Autowired
    public PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found! :c "));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitle(text);
    }
}
