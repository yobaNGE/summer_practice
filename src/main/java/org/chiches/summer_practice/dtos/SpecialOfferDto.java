package org.chiches.summer_practice.dtos;

import org.chiches.summer_practice.entities.MenuItemEntity;

import java.util.List;

public class SpecialOfferDto {
    private String name;
    private double price;

    public SpecialOfferDto(String name, double price) {
        this.name = name;
        this.price = price;
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
