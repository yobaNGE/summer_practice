package org.chiches.summer_practice.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "userTable")
public class UserEntity extends BaseEntity {
    private String name;
    private String surname;
    private String email;
    private double bonusBalance;
    private List<OrderEntity> orderEntityList;

    public UserEntity(String name, String surname, String email, double bonusBalance, List<OrderEntity> orderEntityList) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.bonusBalance = bonusBalance;
        this.orderEntityList = orderEntityList;
    }

    public UserEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "bonus_balance")
    public double getBonusBalance() {
        return bonusBalance;
    }

    public void setBonusBalance(double password) {
        this.bonusBalance = password;
    }

    @OneToMany(targetEntity = OrderEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public List<OrderEntity> getOrderEntityList() {
        return orderEntityList;
    }

    public void setOrderEntityList(List<OrderEntity> orderEntityList) {
        this.orderEntityList = orderEntityList;
    }
}

