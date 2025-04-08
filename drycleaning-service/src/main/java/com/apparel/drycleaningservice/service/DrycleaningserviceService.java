package com.apparel.drycleaningservice.service;

import org.springframework.stereotype.Service;

@Service
public class DrycleaningserviceService {
    
    public String getStatus() {
        return "Drycleaningservice service is running";
    }
}