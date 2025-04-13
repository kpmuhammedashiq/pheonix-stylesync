package com.apparel.rentalservice.controller;

import com.apparel.rentalservice.client.UserClient;
import com.apparel.rentalservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalserviceController {

    private UserClient userClient;

    @Autowired
    public RentalserviceController(UserClient userClient){
        this.userClient = userClient;
    }

    @GetMapping("/ping/{username}")
    public User ping(@PathVariable("username") String userName) {
        User user=userClient.getUserByName(userName);
        return user;
    }
}