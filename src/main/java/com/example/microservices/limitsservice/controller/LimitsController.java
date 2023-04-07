package com.example.microservices.limitsservice.controller;

import com.example.microservices.limitsservice.configuration.Configuration;
import com.example.microservices.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits getLimits(){
        //returning predefined values from configuration properties
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
//        return new Limits(1,1000);
    }
}
