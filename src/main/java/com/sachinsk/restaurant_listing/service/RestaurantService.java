package com.sachinsk.restaurant_listing.service;

import com.sachinsk.restaurant_listing.dto.RestaurantDTO;
import com.sachinsk.restaurant_listing.entity.Restaurant;
import com.sachinsk.restaurant_listing.mapper.RestaurantMapper;
import com.sachinsk.restaurant_listing.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();

        //map the entities fetched above to the List of DTOs
        List<RestaurantDTO> restaurantDTOList = restaurants.stream()
                .map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant))
                .collect(Collectors.toList());

        return restaurantDTOList;
    }
}
