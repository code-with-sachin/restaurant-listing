package com.sachinsk.restaurant_listing.mapper;

import com.sachinsk.restaurant_listing.dto.RestaurantDTO;
import com.sachinsk.restaurant_listing.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    //implementation of the methods will be created automatically by Spring boot
    //so mapping will be done between all entities and DTOs

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
