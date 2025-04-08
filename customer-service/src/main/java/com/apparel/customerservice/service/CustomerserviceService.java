package com.apparel.customerservice.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerserviceService {
    
    public String getStatus() {
        return "Customerservice service is running";
    }
}