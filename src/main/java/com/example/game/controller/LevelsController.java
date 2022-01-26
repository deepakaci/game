package com.example.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.game.entity.Levels;
import com.example.game.services.LevelsService;

@RestController
public class LevelsController {
   
	@Autowired
	private LevelsService levelsService;
	
	
	@RequestMapping("/levels")
	public List<Levels> geAllLevels() {
		return levelsService.getAllLevels();
	}
}
