package com.applicationone.order.service;

import com.applicationone.order.dto.OrderDto;
import com.applicationone.order.dto.OrderDtoFront;
import com.applicationone.order.dto.UserDto;
import com.applicationone.order.entity.Order;
import com.applicationone.order.mapper.OrderMapper;
import com.applicationone.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private SequenceGenerator sequenceGenerator;

    @Autowired
    private RestTemplate restTemplate;

    public OrderDto saveOrder(OrderDtoFront orderDetails) {
        UserDto user = this.fetchUserDetailsFromUserId(orderDetails.getUserId());
        System.out.println(user);
        Order orderToBeSaved = new Order(
                this.sequenceGenerator.generateNextOrderId(),
                orderDetails.getFoodItemsList(),
                orderDetails.getRestaurant(),
                user);

        System.out.println(orderToBeSaved);

        return OrderMapper.INSTANCE.mapOrderToOrderDto(
                orderRepository.save(orderToBeSaved));
    }

    private UserDto fetchUserDetailsFromUserId(Long userId) {

        return restTemplate.getForObject(
                "http://USER-INFORMATION/user/fetchUserById/" + userId,
                UserDto.class);
    }
}
