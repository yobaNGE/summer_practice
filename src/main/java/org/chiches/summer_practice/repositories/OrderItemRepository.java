package org.chiches.summer_practice.repositories;

import org.chiches.summer_practice.entities.OrderItemEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends BaseRepository<OrderItemEntity, Long> {
}
