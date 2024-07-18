package org.chiches.summer_practice.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {
    private String category;
    private String categoryName;
    private List<MenuItemEntity> menuItems;

    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, targetEntity = MenuItemEntity.class, mappedBy = "categoryEntity")
    public List<MenuItemEntity> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItemEntity> menuItems) {
        this.menuItems = menuItems;
    }
}
