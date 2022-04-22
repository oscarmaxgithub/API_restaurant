package com.example.api_restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
public class ApiRestaurantApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRestaurantApplication.class, args);
    }

}
