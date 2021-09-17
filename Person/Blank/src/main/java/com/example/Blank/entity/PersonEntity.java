package com.example.Blank.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class PersonEntity {

    private Integer id;

    private String fName;

    private String lName;

    private String address;
}
