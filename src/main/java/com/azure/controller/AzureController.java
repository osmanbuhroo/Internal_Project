package com.azure.controller;

import com.azure.entity.Azure;
import com.azure.exception.ServiceNotFondException;
import com.azure.service.AzureService;
import com.azure.service.AzureServiceImplementation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AzureController {

    @Autowired
    AzureService azureService;

    @Valid
    @PostMapping("/save")
    private Azure addData(@RequestBody Azure azure){
        return azureService.addData(azure);
    }
    @GetMapping("/find/{id}")
    private Azure find(@PathVariable Long id) throws ServiceNotFondException {
        return azureService.find(id);
    }

    @PutMapping("/update-data/{id}")
    private Azure updateData(@PathVariable Long id, @RequestBody Azure azure) throws ServiceNotFondException {
        return azureService.updateData(id,azure);
    }
}
