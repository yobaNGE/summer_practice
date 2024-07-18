package org.chiches.summer_practice.dtos;

import org.chiches.summer_practice.entities.MenuItemEntity;
import org.chiches.summer_practice.entities.OrderEntity;
import org.chiches.summer_practice.entities.OrderItemEntity;
import org.chiches.summer_practice.entities.UserEntity;

import java.util.List;

public class OrderDto {
    long id;
    private int status;
    private List<OrderItemSubDto> orderItemEntityList;
    private UserEntity user;
    private double totalPrice;

    public OrderDto(long id, int status, List<OrderItemSubDto> orderItemEntityList, UserEntity user, double totalPrice) {
        this.id = id;
        this.status = status;
        this.orderItemEntityList = orderItemEntityList;
        this.user = user;
        this.totalPrice = totalPrice;
    }

    public OrderDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<OrderItemSubDto> getOrderItemEntityList() {
        return orderItemEntityList;
    }

    public void setOrderItemEntityList(List<OrderItemSubDto> orderItemEntityList) {
        this.orderItemEntityList = orderItemEntityList;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


}
