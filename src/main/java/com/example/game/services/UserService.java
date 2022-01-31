package com.example.game.services;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.entity.Games;
import com.example.game.entity.User;
import com.example.game.exception.DataNotFoundException;
import com.example.game.repository.GamesRepsoitory;
import com.example.game.repository.UserRepsoitory;

@Service
public class UserService {

	@Autowired
	private UserRepsoitory userRepsoitory;
	
	@Autowired
	private GamesRepsoitory gamesRepsoitory;

	public User addUser(User user) {
		return userRepsoitory.save(user);
	}

	public User updateUser(Long id, User user) {
		return userRepsoitory.save(user);
	}

	public User updateUserCredit(User user, long userId, long creditValue) {
		user.setCredits(creditValue);
		return userRepsoitory.save(user);
	}

	public List<User> getAllUser() {
		List<User> users = new ArrayList<>();
		userRepsoitory.findAll().forEach(users::add);

		return users;
	}

	public User getUser(long id) {
		return userRepsoitory.findById(id).orElseThrow(() -> new DataNotFoundException("user id is not avilable"));
	}

	public void deleteUser(long id) {
		boolean exist = userRepsoitory.existsById(id);
		if (!exist) {
			throw new IllegalStateException("gamer with id " + id + " does not exists ");
		}
		userRepsoitory.deleteById(id);

	}

	public void addUser(@Valid User user, long id1, long id2, long level) {
		
	Games game=	gamesRepsoitory.findById(id2).get();
	/*
	 * game.s user.setGames(null);
	 */
		
	}

}
