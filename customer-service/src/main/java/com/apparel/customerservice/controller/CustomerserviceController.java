package com.apparel.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerserviceController {

    @GetMapping("/ping")
    public String ping() {
        return "Customerservice service is up";
    }
}