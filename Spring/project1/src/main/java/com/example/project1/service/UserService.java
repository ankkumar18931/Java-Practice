package com.example.project1.service;

import com.example.project1.data.UserRepository;
import com.example.project1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Person> findAll(){
        return userRepository.findAll();
    }

    public Optional<Person> findById(Integer id){
        return userRepository.findById(id);
    }

    public Person save(Person person){
        return userRepository.save(person);
    }

    public void deleteById(Integer id){
       userRepository.deleteById(id);
    }
}
