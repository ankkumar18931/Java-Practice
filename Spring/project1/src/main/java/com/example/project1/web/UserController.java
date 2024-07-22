package com.example.project1.web;


import com.example.project1.model.Person;
import com.example.project1.service.UserService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<Person> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> findById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Person create(@RequestBody Person person){
        System.out.println("post ");
        return userService.save(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteById(id);
    }

}
