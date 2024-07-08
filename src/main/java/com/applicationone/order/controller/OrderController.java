package com.applicationone.order.controller;

import com.applicationone.order.dto.OrderDto;
import com.applicationone.order.dto.OrderDtoFront;
import com.applicationone.order.repository.OrderRepository;
import com.applicationone.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDtoFront orderDetails){
        OrderDto orderSaved = this.orderService.saveOrder(orderDetails);
        System.out.println(orderSaved);
        return new ResponseEntity<>(orderSaved, HttpStatus.OK);
    }


}
