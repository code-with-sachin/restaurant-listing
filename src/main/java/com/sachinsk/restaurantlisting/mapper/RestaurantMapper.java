package com.sachinsk.restaurantlisting.mapper;

import com.sachinsk.restaurantlisting.dto.RestaurantDTO;
import com.sachinsk.restaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

//@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    //implementation of the methods will be created automatically by Spring boot
    //so mapping will be done between all entities and DTOs

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
