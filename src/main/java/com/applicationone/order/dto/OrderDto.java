package com.applicationone.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long orderId;
    private List<FoodItemsDto> foodItemsList;
    private RestaurantDto restaurant;
    private UserDto userDto;
}
