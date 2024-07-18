package org.chiches.summer_practice.controllers;

import org.chiches.summer_practice.dtos.MenuItemDto;
import org.chiches.summer_practice.dtos.UserDto;
import org.chiches.summer_practice.services.PersonalSuggestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonalSuggestionController {
    private final PersonalSuggestionService personalSuggestionService;

    public PersonalSuggestionController(PersonalSuggestionService personalSuggestionService) {
        this.personalSuggestionService = personalSuggestionService;
    }

    @GetMapping("/personalSuggestion")
    public List<MenuItemDto> personalSuggestion(@RequestBody UserDto userDto) {
        return personalSuggestionService.suggest(userDto);
    }
}
