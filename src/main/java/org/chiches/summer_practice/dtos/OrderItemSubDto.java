package org.chiches.summer_practice.dtos;

public class OrderItemSubDto {
    private int quantity;
    private String menuItemEntityName;

    public OrderItemSubDto(int quantity, String menuItemEntityName) {
        this.quantity = quantity;
        this.menuItemEntityName = menuItemEntityName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMenuItemEntityName() {
        return menuItemEntityName;
    }

    public void setMenuItemEntityName(String menuItemEntityName) {
        this.menuItemEntityName = menuItemEntityName;
    }
}
