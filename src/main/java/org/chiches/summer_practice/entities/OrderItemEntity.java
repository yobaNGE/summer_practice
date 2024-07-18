package org.chiches.summer_practice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity
@Table(name = "orderItems")
public class OrderItemEntity extends BaseEntity {

    private int quantity;
    private OrderEntity orderEntity;
    private MenuItemEntity menuItemEntity;

    public OrderItemEntity(int quantity, OrderEntity orderEntity, MenuItemEntity menuItemEntity) {
        this.quantity = quantity;
        this.orderEntity = orderEntity;
        this.menuItemEntity = menuItemEntity;
    }

    public OrderItemEntity() {

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ManyToOne(targetEntity = OrderEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    @ManyToOne(targetEntity = MenuItemEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id", referencedColumnName = "id")
    public MenuItemEntity getMenuItemEntity() {
        return menuItemEntity;
    }

    public void setMenuItemEntity(MenuItemEntity menuItemEntity) {
        this.menuItemEntity = menuItemEntity;
    }
}
