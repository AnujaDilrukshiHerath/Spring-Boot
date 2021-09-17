package com.example.Blank.Service.impl;

import com.example.Blank.Service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {


    public String getPersonFnameInCaps(String fName) {
        return fName.toUpperCase();
    }

    public String getPersonLnameInCaps(String lName) {
        return lName.toUpperCase();
    }

    public String getPersonAddressInCaps(String address) {
        return address.toUpperCase();
    }
}
