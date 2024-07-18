package org.chiches.summer_practice.controllers;

import org.chiches.summer_practice.dtos.SpecialOfferDto;
import org.chiches.summer_practice.services.SpecialOfferService;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpecialOfferController {
    private final SpecialOfferService specialOfferService;

    public SpecialOfferController(SpecialOfferService specialOfferService) {
        this.specialOfferService = specialOfferService;
    }
    @PostMapping("/createSpecialOffer")
    public SpecialOfferDto createSpecialOffer(@RequestBody SpecialOfferDto specialOfferDto) {
       return specialOfferService.createSpecialOffer(specialOfferDto);
    }
    @PatchMapping("/updateSpecialOfferDetails")
    public SpecialOfferDto updateSpecial(@RequestBody SpecialOfferDto specialOfferDto) {
        return specialOfferService.updateSpecialOfferDetails(specialOfferDto);
    }
    @PatchMapping("/addMenuItemToSpecialOffer")
    public SpecialOfferDto addMenuItem(@RequestBody SpecialOfferDto specialOfferDto, @RequestParam("itemId") Long menuItemId) {
        return specialOfferService.addMenuItemToSpecialOffer(specialOfferDto, menuItemId);
    }
    @PatchMapping("/removeMenuItemFromSpecialOffer")
    public SpecialOfferDto removeMenuItem(@RequestBody SpecialOfferDto specialOfferDto, Long menuItemId) {
        return specialOfferService.removeMenuItemFromSpecialOffer(specialOfferDto, menuItemId);
    }
}
