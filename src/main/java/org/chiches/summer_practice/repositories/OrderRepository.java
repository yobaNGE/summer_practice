package org.chiches.summer_practice.repositories;

import org.chiches.summer_practice.entities.OrderEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends BaseRepository<OrderEntity, Long> {

}
