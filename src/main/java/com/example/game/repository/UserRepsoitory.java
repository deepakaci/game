package com.example.game.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.game.entity.User;

@Repository
public interface UserRepsoitory extends CrudRepository<User, Long> {

}
