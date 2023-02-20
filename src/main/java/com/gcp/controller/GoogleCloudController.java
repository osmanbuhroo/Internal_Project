package com.gcp.controller;

import com.gcp.entity.GoogleCloud;
import com.gcp.service.GoogleCloudService;
import com.gcp.service.GoogleCloudServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.ServiceNotFoundException;
import javax.validation.Valid;

@RestController
public class GoogleCloudController {

    @Autowired
    GoogleCloudService googleCloudService;

    @Valid

    @PostMapping("/save")
    private GoogleCloud addData(@RequestBody GoogleCloud googleCloud){

        return  googleCloudService.addData(googleCloud);

    }
    @GetMapping("/find/{id}")
    private GoogleCloud find(@PathVariable long id) throws ServiceNotFoundException {
        return googleCloudService.find(id);
    }

    @PutMapping("/update-data/{id}")
    private GoogleCloud updateData(@PathVariable Long id,@RequestBody GoogleCloud googleCloud){
        return googleCloudService.updateData(id,googleCloud);
    }


}

