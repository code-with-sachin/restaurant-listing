package com.sachinsk.restaurant_listing.service;

import com.sachinsk.restaurant_listing.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;
}
