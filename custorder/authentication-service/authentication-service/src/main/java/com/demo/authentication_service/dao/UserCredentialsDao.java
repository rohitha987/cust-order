package com.demo.authentication_service.dao;

import com.demo.authentication_service.dao.entity.UserCredentialsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialsDao extends JpaRepository<UserCredentialsEntity, Integer> {
    public Optional<UserCredentialsEntity> findByName(String name);
}
