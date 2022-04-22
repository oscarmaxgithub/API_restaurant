package com.example.api_restaurant.services.impl;

import com.example.api_restaurant.models.daos.RestaurantDao;
import com.example.api_restaurant.models.entitys.Restaurant;
import com.example.api_restaurant.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantDao restaurantDao;

    @Override
    public List<Restaurant> findAll() {
        return (List<Restaurant>) restaurantDao.findAll();
    }

    @Override
    public Restaurant findById(Long id) {
        return restaurantDao.findById(id).orElse(null);
    }

    public void updateByID(Long id, float score) {
        try{
            restaurantDao.updateByID(id,score);
        }catch (Exception e){
            System.out.println("ERROR "+e.getMessage());
        }


    }
}
