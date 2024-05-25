package com.applicationone.order.entity;

import com.applicationone.order.dto.FoodItemsDto;
import com.applicationone.order.dto.RestaurantDto;
import com.applicationone.order.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

    private Long orderId;
    private List<FoodItemsDto> foodItemsList;
    private RestaurantDto restaurant;
    private UserDto userDto;

}
