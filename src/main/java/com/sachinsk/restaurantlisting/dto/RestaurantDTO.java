package com.sachinsk.restaurantlisting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor      //Optional since: If we override AllArgs Constructor , NoArgsConstructor will be by default overridden
public class RestaurantDTO {
    private int restaurantId;
    private String restaurantName;
    private String address;
    private String city;
    private String restaurantDescription;
}
