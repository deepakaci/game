package com.example.game.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.entity.Games;
import com.example.game.exception.DataNotFoundException;
import com.example.game.repository.GamesRepsoitory;

@Service
public class GamesService {

	@Autowired
	private GamesRepsoitory gameRepsoitory;

	public Games addGames(Games game) {
		return gameRepsoitory.save(game);
	}
	
	public Games updateGames(Long id,Games user) {
		return gameRepsoitory.save(user);
	}
	

	public List<Games> getAllGames() {

		List<Games> games = new ArrayList<>();
		gameRepsoitory.findAll().forEach(games::add);

		return games;
	}
	
	public Games getGames(long id)
	{
	   	Games game=gameRepsoitory.findById(id).orElseThrow(()-> new DataNotFoundException("oops unable to find games"));
	   	return game;
	}

	public void deleteGame(long id) {
		gameRepsoitory.deleteById(id);
		
	}
	
	public Games updateGame(long id , Games game) {
		return gameRepsoitory.save(game);
	}

}
