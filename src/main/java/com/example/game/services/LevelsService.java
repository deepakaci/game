package com.example.game.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.entity.Levels;
import com.example.game.repository.LevelsRepsoitory;

@Service
public class LevelsService {
	
	@Autowired
	private LevelsRepsoitory levelRepsoitory;
	
	@SuppressWarnings("unchecked")
	public List<Levels> getAllLevels() {

		List<Levels> levels = new ArrayList<>();
		levelRepsoitory.findAll().forEach(levels::add);

		return levels;
	}
	

}
