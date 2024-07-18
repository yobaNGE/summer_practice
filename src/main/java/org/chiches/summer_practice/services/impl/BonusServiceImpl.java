package org.chiches.summer_practice.services.impl;

import org.chiches.summer_practice.dtos.UserDto;
import org.chiches.summer_practice.entities.UserEntity;
import org.chiches.summer_practice.exception.BonusPointsIncorrectExceptions;
import org.chiches.summer_practice.exception.EntitiyNotFoundException;
import org.chiches.summer_practice.repositories.UserRepository;
import org.chiches.summer_practice.services.BonusProgramService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class BonusServiceImpl implements BonusProgramService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public BonusServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto checkBonusBalance(UserDto userDto) {
        UserEntity userEntity = userRepository.findById(userDto.getId()).orElseThrow(()-> new EntitiyNotFoundException("User not found " + userDto.getId()));
        UserDto userDto1 = new UserDto();
        userDto1.setBonusBalance(userEntity.getBonusBalance());
        return userDto1;
    }

    @Override
    public UserDto addBonusPoints(UserDto userDto, double bonusPoints) {
        if (bonusPoints < 0) {
            throw new BonusPointsIncorrectExceptions("Bonus points cannot be negative " + bonusPoints);
        }
        UserEntity userEntity = userRepository.findById(userDto.getId()).orElseThrow(()-> new EntitiyNotFoundException("User not found " + userDto.getId()));
        userEntity.setBonusBalance(userEntity.getBonusBalance() + bonusPoints);
        userRepository.save(userEntity);
        UserDto userDto1 = modelMapper.map(userEntity, UserDto.class);
        return userDto1;
    }

    @Override
    public UserDto subtractBonusPoints(UserDto userDto, double bonusPoints) {
        if (bonusPoints < 0) {
            throw new BonusPointsIncorrectExceptions("Bonus points cannot be negative " + bonusPoints);
        }
        UserEntity userEntity = userRepository.findById(userDto.getId()).orElseThrow(()-> new EntitiyNotFoundException("User not found " + userDto.getId()));
        userEntity.setBonusBalance(userEntity.getBonusBalance() - bonusPoints);
        userRepository.save(userEntity);
        UserDto userDto1 = modelMapper.map(userEntity, UserDto.class);
        return userDto1;
    }
}
