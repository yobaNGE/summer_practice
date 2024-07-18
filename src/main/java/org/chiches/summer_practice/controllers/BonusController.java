package org.chiches.summer_practice.controllers;

import org.chiches.summer_practice.dtos.UserDto;
import org.chiches.summer_practice.services.BonusProgramService;
import org.springframework.web.bind.annotation.*;

@RestController
public class BonusController {
    private final BonusProgramService bonusProgramService;

    public BonusController(BonusProgramService bonusProgramService) {
        this.bonusProgramService = bonusProgramService;
    }
    @GetMapping("/checkBonusBalance")
    public UserDto checkBonusBalance(@RequestBody UserDto userDto) {
        return bonusProgramService.checkBonusBalance(userDto);
    }
    @PatchMapping("/addBonusPoints")
    public UserDto addBonusPoints(@RequestBody UserDto userDto, @RequestParam("points") double bonusPoints) {
        return bonusProgramService.addBonusPoints(userDto, bonusPoints);
    }
    @PatchMapping("/subtractBonusPoints")
    public UserDto subtractBonusPoints(@RequestBody UserDto userDto, @RequestParam("points") double bonusPoints) {
        return bonusProgramService.subtractBonusPoints(userDto, bonusPoints);
    }
}
