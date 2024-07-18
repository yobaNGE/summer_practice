package org.chiches.summer_practice.repositories;

import org.chiches.summer_practice.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<UserEntity, Long> {

}
