package com.example.project1.model;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;


@Entity
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @Getter
//    @Schema(name = "username", type = "string")
    private String username;
    @Column
    @Getter
//    @Schema(name = "first_name", type = "string")
    private String firstName;
    @Column
    @Getter
//    @Schema(name = "last_name")
    private String lastName;


}
