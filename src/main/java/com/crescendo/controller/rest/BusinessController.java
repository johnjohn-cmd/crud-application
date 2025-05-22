package com.crescendo.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BusinessController {

    @GetMapping("/helloWorld")
    public List<String> sayHello() {
        List<String> test = new ArrayList();
        test.add("Hello World");
        test.add("Hi");
        return test;
    }
}
