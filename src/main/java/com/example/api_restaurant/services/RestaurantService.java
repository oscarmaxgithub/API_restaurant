package com.example.api_restaurant.services;

import com.example.api_restaurant.models.entitys.Restaurant;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantService {
    public List<Restaurant> findAll();
    public Restaurant findById(Long id);

    public void updateByID(Long id,float score);
}
