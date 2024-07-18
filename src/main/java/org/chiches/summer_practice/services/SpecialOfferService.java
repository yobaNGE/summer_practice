package org.chiches.summer_practice.services;

import org.chiches.summer_practice.dtos.SpecialOfferDto;

public interface SpecialOfferService {
    SpecialOfferDto createSpecialOffer(SpecialOfferDto specialOfferDto);
    SpecialOfferDto updateSpecialOfferDetails(SpecialOfferDto specialOfferDto);
    SpecialOfferDto addMenuItemToSpecialOffer(SpecialOfferDto specialOfferDto, Long menuItemId);
    SpecialOfferDto removeMenuItemFromSpecialOffer(SpecialOfferDto specialOfferDto, Long menuItemId);
}
