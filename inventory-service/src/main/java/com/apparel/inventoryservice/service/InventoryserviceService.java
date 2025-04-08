package com.apparel.inventoryservice.service;

import org.springframework.stereotype.Service;

@Service
public class InventoryserviceService {
    
    public String getStatus() {
        return "Inventoryservice service is running";
    }
}