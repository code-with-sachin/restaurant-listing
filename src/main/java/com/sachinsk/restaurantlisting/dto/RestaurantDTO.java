package com.sachinsk.restaurantlisting.dto;

import lombok.Data;

//Optional since: If we override AllArgs Constructor , NoArgsConstructor will be by default overridden
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
public class RestaurantDTO {
    private int restaurantId;
    private String restaurantName;
    private String address;
    private String city;
    private String restaurantDescription;

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public RestaurantDTO() {
    }

    public RestaurantDTO(int restaurantId, String restaurantName, String address, String city, String restaurantDescription) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.address = address;
        this.city = city;
        this.restaurantDescription = restaurantDescription;
    }
}
