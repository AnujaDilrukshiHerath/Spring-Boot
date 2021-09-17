package com.example.Blank.Controller;


import com.example.Blank.Service.PersonService;
import com.example.Blank.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/person")
public class PersonController {



    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/toupper/{fName}")
    public String personName(@PathVariable String fName){
        return personService.getPersonFnameInCaps(fName);
    }

    @GetMapping("/toupper/{lName}")
    public String personLName(@PathVariable String lName){
        return personService.getPersonLnameInCaps(lName);
    }

    @GetMapping("/toupper/{address}")
    public String personAddress(@PathVariable String address){
        return personService.getPersonAddressInCaps(address);
    }
    @PostMapping
    public void addNewPerson(@RequestBody PersonDto personDto){
        System.out.println(personDto.toString());
    }


}
