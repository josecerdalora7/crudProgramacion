package com.unac.crudProgramacion.dao;

import com.unac.crudProgramacion.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserEntity, Integer> {

}
