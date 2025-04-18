package com.sachinsk.restaurantlisting.service.impl;

import com.sachinsk.restaurantlisting.dto.RestaurantDTO;
import com.sachinsk.restaurantlisting.entity.Restaurant;
import com.sachinsk.restaurantlisting.mapper.RestaurantMapper;
import com.sachinsk.restaurantlisting.repository.RestaurantRepo;
import com.sachinsk.restaurantlisting.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

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

    public RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO) {
        //mapping to entity since we can't save DTO to DB
        Restaurant savedRestaurant = restaurantRepo.save(RestaurantMapper.INSTANCE.mapRestaurantDTOToRestaurant(restaurantDTO));

        //mapping entity back to DTO since we are returning DTO
        return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(savedRestaurant);
    }

    public RestaurantDTO getRestaurantById(Integer id) {
        //Restaurant restaurantFound = restaurantRepo.findById(id).orElse(null);
        //return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurantFound);

        //Another way to implement above logic

        Optional<Restaurant> restaurantFound = restaurantRepo.findById(id);
        if (restaurantFound.isPresent()) {
            return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurantFound.get());
        } else {
            return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(null);
        }
    }
}

