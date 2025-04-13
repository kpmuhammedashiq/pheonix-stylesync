package com.apparel.rentalservice.service;

import com.apparel.rentalservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RentalserviceService {
    private final WebClient.Builder webClientBuilder;

    @Autowired
    public RentalserviceService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public User getUserDetails(Long userId) {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8090/users/" + userId)  // Adjust the URL according to your user-service
                .retrieve()
                .bodyToMono(User.class)
                .block();
    }

    public String getStatus() {
        return "Rentalservice service is running";
    }
}