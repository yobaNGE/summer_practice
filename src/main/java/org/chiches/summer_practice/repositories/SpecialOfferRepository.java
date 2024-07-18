package org.chiches.summer_practice.repositories;

import org.chiches.summer_practice.entities.SpecialOffer;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialOfferRepository extends BaseRepository<SpecialOffer, Long> {
    SpecialOffer findByName(String name);
}
