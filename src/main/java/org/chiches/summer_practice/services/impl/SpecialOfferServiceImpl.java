package org.chiches.summer_practice.services.impl;

import org.chiches.summer_practice.dtos.SpecialOfferDto;
import org.chiches.summer_practice.entities.MenuItemEntity;
import org.chiches.summer_practice.entities.SpecialOffer;
import org.chiches.summer_practice.repositories.MenuItemRepository;
import org.chiches.summer_practice.repositories.SpecialOfferRepository;
import org.chiches.summer_practice.services.SpecialOfferService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SpecialOfferServiceImpl implements SpecialOfferService {
    private final ModelMapper modelMapper;
    private final SpecialOfferRepository specialOfferRepository;
    private final MenuItemRepository menuItemRepository;

    public SpecialOfferServiceImpl(ModelMapper modelMapper, SpecialOfferRepository specialOfferRepository, MenuItemRepository menuItemRepository) {
        this.modelMapper = modelMapper;
        this.specialOfferRepository = specialOfferRepository;
        this.menuItemRepository = menuItemRepository;
    }

    @Override
    public SpecialOfferDto createSpecialOffer(SpecialOfferDto specialOfferDto) {
        SpecialOffer specialOffer = modelMapper.map(specialOfferDto, SpecialOffer.class);
        specialOfferRepository.save(specialOffer);
        return specialOfferDto;
    }

    @Override
    public SpecialOfferDto updateSpecialOfferDetails(SpecialOfferDto specialOfferDto) {
        SpecialOffer specialOffer = specialOfferRepository.findByName(specialOfferDto.getName());
        if (specialOffer != null) {
            specialOffer.setPrice(specialOfferDto.getPrice());
            specialOffer.setName(specialOfferDto.getName());
            specialOfferRepository.save(specialOffer);
            return specialOfferDto;
        } else throw new IllegalArgumentException("Special offer not found");
    }

    @Override
    public SpecialOfferDto addMenuItemToSpecialOffer(SpecialOfferDto specialOfferDto, Long menuItemId) {
        SpecialOffer specialOffer = specialOfferRepository.findByName(specialOfferDto.getName());
        if (specialOffer != null) {
            MenuItemEntity menuItem = menuItemRepository.findById(menuItemId).orElse(null);
            if (menuItem == null) {
                throw new IllegalArgumentException("Menu item not found");
            }
            specialOffer.getMenuItems().add(menuItem);
            specialOfferRepository.save(specialOffer);
            return specialOfferDto;
        } else throw new IllegalArgumentException("Special offer not found");
    }

    @Override
    public SpecialOfferDto removeMenuItemFromSpecialOffer(SpecialOfferDto specialOfferDto, Long menuItemId) {
        SpecialOffer specialOffer = specialOfferRepository.findByName(specialOfferDto.getName());
        if (specialOffer != null) {
            MenuItemEntity menuItem = menuItemRepository.findById(menuItemId).orElse(null);
            if (menuItem == null) {
                throw new IllegalArgumentException("Menu item not found");
            }
            specialOffer.getMenuItems().remove(menuItem);
            specialOfferRepository.save(specialOffer);
            return specialOfferDto;
        } else throw new IllegalArgumentException("Special offer not found");
    }


}
