package com.fabriciomont.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fabriciomont.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {



@GetMapping
public ResponseEntity<List<User>> findAll(){
    User maria = new User("1", "Maria", "maria@hotmail.com");

    User alex = new User("2", "Alex", "alex@hotmail.com");
    
    List<User> list = new ArrayList<User>();
    list.addAll(Arrays.asList(maria, alex));

    return ResponseEntity.ok().body(list);
}


}
