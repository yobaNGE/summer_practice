package org.chiches.summer_practice.services;

import org.chiches.summer_practice.dtos.MenuItemDto;
import org.chiches.summer_practice.dtos.UserDto;
import org.chiches.summer_practice.entities.MenuItemEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonalSuggestionService {
    List<MenuItemDto> suggest(UserDto userDto);
}
