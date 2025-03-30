package com.sachinsk.restaurantlisting.service;

import com.sachinsk.restaurantlisting.dto.RestaurantDTO;
import com.sachinsk.restaurantlisting.entity.Restaurant;
import com.sachinsk.restaurantlisting.mapper.RestaurantMapper;
import com.sachinsk.restaurantlisting.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public interface RestaurantService {

    public List<RestaurantDTO> findAllRestaurants();

    RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO);

    public RestaurantDTO getRestaurantById(Integer id);
}
