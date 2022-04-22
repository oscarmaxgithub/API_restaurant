package com.example.api_restaurant.models.daos;

import com.example.api_restaurant.models.entitys.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TransactionRequiredException;

public interface RestaurantDao extends JpaRepository<Restaurant,Long> {

    @Transactional
    @Modifying
    @Query("Update Restaurant r set r.score= :score where r.id= :id")
    public void updateByID(Long id,float score)throws TransactionRequiredException;
}
