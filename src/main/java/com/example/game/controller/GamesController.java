package com.example.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.game.entity.Games;
import com.example.game.services.GamesService;

@RestController
public class GamesController {

	@Autowired
	private GamesService gameService;
	
	
	@RequestMapping("/games")
	public List<Games> geAllLevels() {
		return gameService.getAllGames();
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/game")
	public void addGame(@RequestBody  Games game) {
		gameService.addGames(game);
	}
	
	@RequestMapping("/games/{id}")
	public Games getGameByName(@PathVariable("id") long id)
	{
		return gameService.getGames(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/game/{id}")
	public void deleteGame(@PathVariable long id)
    {
		gameService.deleteGame(id);

	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/gmae/{id}")
	public Games updateGame(@RequestBody Games game, @PathVariable long id) {
		
		return gameService.updateGame(id, game);
		
	}


}
