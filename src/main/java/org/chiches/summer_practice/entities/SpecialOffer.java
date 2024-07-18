package org.chiches.summer_practice.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "special_offers")
public class SpecialOffer extends BaseEntity{
    private List<MenuItemEntity> menuItems;
    private String name;
    private double price;

    public SpecialOffer(List<MenuItemEntity> menuItems, String name, double price) {
        this.menuItems = menuItems;
        this.name = name;
        this.price = price;
    }

    public SpecialOffer() {

    }
    @OneToMany(targetEntity = MenuItemEntity.class,fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    public List<MenuItemEntity> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItemEntity> menuItems) {
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
