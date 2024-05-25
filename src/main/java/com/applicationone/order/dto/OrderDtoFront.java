package com.applicationone.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDtoFront {


    private List<FoodItemsDto> foodItemsList;
    private Long userId;
    private RestaurantDto restaurant;
}
