package com.sachinsk.restaurantlisting.controller;

import com.sachinsk.restaurantlisting.dto.RestaurantDTO;
import com.sachinsk.restaurantlisting.entity.Restaurant;
import com.sachinsk.restaurantlisting.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/fetchAllRestaurants")
    public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurants() {
        List<RestaurantDTO> allRestaurants = restaurantService.findAllRestaurants();
        return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
    }
//    @GetMapping("/fetchAllRestaurants")
//    public ResponseEntity<List<Restaurant>> fetchAllRestaurants() {
//        List<Restaurant> allRestaurants = restaurantService.findAllRestaurants();
//        return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
//    }

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDTO> saveRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
        RestaurantDTO restaurantAdded = restaurantService.addRestaurantInDB(restaurantDTO);
        return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);

    }
//    @PostMapping("/addRestaurant")
//    public ResponseEntity<Restaurant> saveRestaurant(@RequestBody Restaurant restaurant) {
//        Restaurant restaurantAdded = restaurantService.addRestaurantInDB(restaurant);
//        return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);
//
//    }
}
