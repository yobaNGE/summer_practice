package org.chiches.summer_practice.services.impl;

import org.chiches.summer_practice.dtos.MenuItemDto;
import org.chiches.summer_practice.dtos.UserDto;
import org.chiches.summer_practice.entities.MenuItemEntity;
import org.chiches.summer_practice.exception.EntitiyNotFoundException;
import org.chiches.summer_practice.repositories.CategoryRepository;
import org.chiches.summer_practice.repositories.MenuItemRepository;
import org.chiches.summer_practice.repositories.UserRepository;
import org.chiches.summer_practice.services.PersonalSuggestionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalSuggestionImpl implements PersonalSuggestionService {
    private final UserRepository userRepository;
    private final MenuItemRepository menuItemRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public PersonalSuggestionImpl(UserRepository userRepository, MenuItemRepository menuItemRepository, CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.menuItemRepository = menuItemRepository;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<MenuItemDto> suggest(UserDto userDto) {
        List<Long> categoryId = categoryRepository.findMostPopularCategoryByUserId(userDto.getId());
        if (categoryId.isEmpty()) {
            throw new EntitiyNotFoundException("No categories found for user " + userDto.getId());
        }
        List<MenuItemEntity> suggested = menuItemRepository.findByCategoryId(categoryId.get(0));
        List<MenuItemDto> menuItemDtos = suggested.stream()
                .map(menuItemEntity ->
                        modelMapper.map(menuItemEntity, MenuItemDto.class))
                .toList();
        return menuItemDtos;
    }
}
