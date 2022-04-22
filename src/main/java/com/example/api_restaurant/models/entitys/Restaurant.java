package com.example.api_restaurant.models.entitys;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "restaurant")
@ToString
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "score")
    private float score;

    public Restaurant(Long id, float score) {
        this.id = id;
        this.score = score;
    }

    public Restaurant() {

    }
}
