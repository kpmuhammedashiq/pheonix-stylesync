package com.apparel.rentalservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalserviceController {

    @GetMapping("/ping")
    public String ping() {
        return "Rentalservice service is up";
    }
}