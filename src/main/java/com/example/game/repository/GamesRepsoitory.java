package com.example.game.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.game.entity.Games;

@Repository
public interface GamesRepsoitory extends CrudRepository<Games, Long> {

}
