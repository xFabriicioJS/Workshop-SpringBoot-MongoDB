package com.fabriciomont.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fabriciomont.workshopmongo.domain.User;
import com.fabriciomont.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

    @Autowired
    private UserService service;


@GetMapping
public ResponseEntity<List<User>> findAll(){
    List<User> list = service.findAll();
    return ResponseEntity.ok().body(list);
}


}
