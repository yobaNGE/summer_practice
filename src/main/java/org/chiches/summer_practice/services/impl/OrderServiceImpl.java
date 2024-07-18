package org.chiches.summer_practice.services.impl;

import org.chiches.summer_practice.dtos.OrderDto;
import org.chiches.summer_practice.dtos.OrderItemSubDto;
import org.chiches.summer_practice.entities.MenuItemEntity;
import org.chiches.summer_practice.entities.OrderEntity;
import org.chiches.summer_practice.entities.OrderItemEntity;
import org.chiches.summer_practice.repositories.MenuItemRepository;
import org.chiches.summer_practice.repositories.OrderRepository;
import org.chiches.summer_practice.repositories.SpecialOfferRepository;
import org.chiches.summer_practice.services.OrderService;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final MenuItemRepository menuItemRepository;
    private final SpecialOfferRepository specialOfferRepository;
    private final ModelMapper modelMapper;

    public OrderServiceImpl(OrderRepository orderRepository, MenuItemRepository menuItemRepository, SpecialOfferRepository specialOfferRepository, ModelMapper modelMapper) {
        this.orderRepository = orderRepository;
        this.menuItemRepository = menuItemRepository;
        this.specialOfferRepository = specialOfferRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        return null;
    }
}
