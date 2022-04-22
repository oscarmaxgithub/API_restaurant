package com.example.api_restaurant.controllers;

import com.example.api_restaurant.models.entitys.Restaurant;
import com.example.api_restaurant.services.impl.RestaurantServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;


@RestController
public class RestaurantController {
    private static Logger logger = LoggerFactory.getLogger(RestaurantController.class);
    @Autowired
    private RestaurantServiceImpl service;

    @GetMapping("/listar")
    public List<Restaurant> listar(){
        return service.findAll();
    }

    @GetMapping("/ver/{id}")
    public Restaurant detalle(@PathVariable Long id) {
        return  service.findById(id);
    }

    @Scheduled(cron = "0/20 * * * * ?")
    public void updateScore(){
        Random r = new Random();
        Random r2 = new Random();
        float random = 3 + r.nextFloat() * (5 - 3);
        Long randomInt = (new Double ((Math.random() * ((5 - 1) + 1)) + 1)).longValue();
        DecimalFormat formato1 = new DecimalFormat("#.0");
        System.out.println(formato1.format(random));
        System.out.println("codigo "+randomInt);
        float score=Float.parseFloat(formato1.format(random));
        logger.info("Cambiando Score cada 20 Seg");
        logger.info("valor random a cambiar en score: "+formato1.format(random));
        service.updateByID(randomInt,score);
        service.findAll().stream().map(re->re.toString()).forEach(System.out::println);
    }
}
