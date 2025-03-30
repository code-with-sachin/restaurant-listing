package com.sachinsk.restaurantlisting.service;

import com.sachinsk.restaurantlisting.dto.RestaurantDTO;

import java.util.List;

public interface RestaurantService {

    public List<RestaurantDTO> findAllRestaurants();

    RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO);

    public RestaurantDTO getRestaurantById(Integer id);
}
