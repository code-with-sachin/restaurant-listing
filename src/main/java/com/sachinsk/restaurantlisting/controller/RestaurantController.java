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

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDTO> saveRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
        RestaurantDTO restaurantAdded = restaurantService.addRestaurantInDB(restaurantDTO);
        return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);

    }

    @GetMapping("/fetchById/{id}")
    public ResponseEntity<RestaurantDTO> getRestaurantById(@PathVariable Integer id){
        RestaurantDTO searchedRestaurant = restaurantService.getRestaurantById(id);
        if (searchedRestaurant != null) {
            return new ResponseEntity<>(searchedRestaurant, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
