package org.chiches.summer_practice.services;

import org.chiches.summer_practice.dtos.OrderDto;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);
}
