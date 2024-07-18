package org.chiches.summer_practice.dtos;

public class MenuItemDto {
    private long id;
    private int quantity;
    private double price;
    private String name;

    public MenuItemDto(long id, int quantity, double price, String name) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public MenuItemDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
