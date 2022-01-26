package com.example.game.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.entity.User;
import com.example.game.exception.DataNotFoundException;
import com.example.game.repository.UserRepsoitory;

@Service
public class UserService {

	@Autowired
	private UserRepsoitory userRepsoitory;

	public User addUser(User user) {
		return userRepsoitory.save(user);
	}
	
	public User updateUser(Long id,User user) {
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
	
	public User getUser(long id) throws DataNotFoundException
	{
	   	User user=userRepsoitory.findById(id).orElseThrow(()-> new DataNotFoundException("oops unable to find user"));
	   	return user;
	}

	public void deleteUser(long id) {
		userRepsoitory.deleteById(id);
		
	}

}
