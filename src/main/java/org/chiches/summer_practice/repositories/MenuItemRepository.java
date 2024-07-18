package org.chiches.summer_practice.repositories;

import org.chiches.summer_practice.entities.MenuItemEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends BaseRepository<MenuItemEntity, Long> {
    @Query("SELECT mi FROM MenuItemEntity mi WHERE mi.categoryEntity.id = :categoryId")
    List<MenuItemEntity> findByCategoryId(@Param("categoryId") Long categoryId);
    List<MenuItemEntity> findAllByName(String name);
}
