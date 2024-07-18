package org.chiches.summer_practice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ordersTable")
public class OrderEntity extends BaseEntity {

    private int status;
    private List<OrderItemEntity> orderItemEntityList;
    private UserEntity user;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @OneToMany(targetEntity = OrderItemEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    public List<OrderItemEntity> getOrderItemEntityList() {
        return orderItemEntityList;
    }

    public void setOrderItemEntityList(List<OrderItemEntity> orderItemEntityList) {
        this.orderItemEntityList = orderItemEntityList;
    }

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}