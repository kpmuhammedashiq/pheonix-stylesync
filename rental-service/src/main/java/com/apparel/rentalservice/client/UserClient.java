package com.apparel.rentalservice.client;

import com.apparel.rentalservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class UserClient {

    @Autowired
    WebClient.Builder builder;

    public User getUserByName(String userName){
        return builder.build().get().uri("http://localhost:8090/users/" + userName)
                .retrieve()
                .bodyToMono(User.class)
                .block();
//                .subscribe(user -> System.out::println);
    }
}
