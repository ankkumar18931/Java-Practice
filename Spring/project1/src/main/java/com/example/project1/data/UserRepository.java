package com.example.project1.data;

import com.example.project1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Person, Integer> {
    List<Person> findByFirstName(String name);
}
