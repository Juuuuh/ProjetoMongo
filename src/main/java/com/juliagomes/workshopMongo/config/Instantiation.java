package com.juliagomes.workshopMongo.config;

import java.util.Arrays;

import com.juliagomes.workshopMongo.domain.User;
import com.juliagomes.workshopMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userReposiroty;

    @Override
    public void run(String... arg0) throws Exception {

        userReposiroty.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
    }

}
