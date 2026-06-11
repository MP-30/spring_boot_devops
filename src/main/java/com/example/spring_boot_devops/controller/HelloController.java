package com.example.spring_boot_devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello Aditya! Spring Boot is running.";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/version")
    public String version() {
        return "1.0.0";
    }
}
//I am testing SCM poll
//Now i am testing webhook of github using pinggy.io
//class check faulty code with jenkins
//now testing pipeline
//retry
//final check of pipeline with email also