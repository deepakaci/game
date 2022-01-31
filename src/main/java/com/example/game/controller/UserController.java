package com.example.game.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.game.entity.User;
import com.example.game.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List<User> geAllUsers() {
		return userService.getAllUser();
	}

	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable long id) {
			return userService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@Valid @RequestBody User user) {
		userService.addUser(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable long id) {
		userService.updateUser(id, user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id1}/credit/{id2}")
	public void updateUserCredits(@RequestBody User user, @PathVariable long id1, @PathVariable long id2) {
		userService.updateUserCredit(user, id1, id2);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable long id){
		userService.deleteUser(id);
	}
	
	

}
