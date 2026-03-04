package com.juliagomes.workshopMongo.resources;

import com.juliagomes.workshopMongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User july = new User("1", "July Floss", "julyfoss@gmail.com");
        User ana = new User("2", "Ana Paula", "anapaula@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(july,ana));
        return ResponseEntity.ok().body(list);
    }
}
