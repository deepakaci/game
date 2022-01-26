package com.example.game.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.game.entity.Levels;

@Repository
public interface LevelsRepsoitory extends CrudRepository<Levels, Long> {

}
