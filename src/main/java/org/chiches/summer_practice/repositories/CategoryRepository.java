package org.chiches.summer_practice.repositories;

import org.chiches.summer_practice.entities.CategoryEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends BaseRepository<CategoryEntity, Long> {
    @Query("SELECT c.id FROM OrderItemEntity o JOIN o.menuItemEntity mi JOIN mi.categoryEntity c WHERE o.orderEntity.user.id = :userId GROUP BY c.id ORDER BY COUNT(c.id) DESC")
    List<Long> findMostPopularCategoryByUserId(@Param("userId") Long userId);
}
