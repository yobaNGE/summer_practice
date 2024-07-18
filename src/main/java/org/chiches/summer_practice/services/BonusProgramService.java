package org.chiches.summer_practice.services;

import org.chiches.summer_practice.dtos.UserDto;

public interface BonusProgramService {
    UserDto checkBonusBalance(UserDto userDto);
    UserDto addBonusPoints(UserDto userDto, double bonusPoints);
    UserDto subtractBonusPoints(UserDto userDto, double bonusPoints);
}
