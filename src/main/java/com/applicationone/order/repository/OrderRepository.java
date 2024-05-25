package com.applicationone.order.repository;

import com.applicationone.order.dto.OrderDto;
import com.applicationone.order.dto.OrderDtoFront;
import com.applicationone.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {

}
