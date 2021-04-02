package com.org.pets.controller;

import com.org.pets.model.DogList;
import com.org.pets.repository.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DogContro {
    @Autowired
    DogRepo dogRepo;
    @PostMapping("/Create")
    public void createDogList(@RequestBody DogList c){
        dogRepo.save(c);
    }

    }



