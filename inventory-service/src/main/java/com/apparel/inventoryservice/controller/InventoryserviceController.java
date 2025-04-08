package com.apparel.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryserviceController {

    @GetMapping("/ping")
    public String ping() {
        return "Inventoryservice service is up";
    }
}