package com.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.core.annotation.Order;
import org.springframework.data.repository.support.Repositories;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;

import com.example.game.entity.Geography;
import com.example.game.entity.User;
import com.example.game.repository.UserRepsoitory;
import com.fasterxml.jackson.annotation.OptBoolean;

import lombok.val;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsersRepositoryTest {

	@Autowired
	private UserRepsoitory repsoitory;

	@Test
	@Order(value = 1)
	@Rollback(value = false)
	public void saveUserTest() {
		User user = User.builder().name("Deepak").nickName("deepu").gender("male").geoId(Geography.USA).build();
		repsoitory.save(user);
		Assertions.assertThat(user.getId()).isGreaterThan(0);

	}

	

	@Test
	@Order(value = 2)
	@Rollback(value = false)
	public void getUserTest() {
		User user = repsoitory.findById(1L).get();
		Assertions.assertThat(user.getId()).isEqualTo(1L);
	}

	@Test
	@Order(value = 3)
	@Rollback(value = false)
	public void getAllUserTest() {
		List<User> users = new ArrayList<>();
		repsoitory.findAll().forEach(users::add);
		Assertions.assertThat(users.size()).isGreaterThan(0);
	}

	@Test
	@Order(value = 4)
	@Rollback(value = false)
	public void updateUserTest() {
		User user = repsoitory.findById(1L).get();
		user.setNickName("abcd");
		User userUpdated = repsoitory.save(user);
		Assertions.assertThat(userUpdated.getNickName()).isEqualTo("abcd");
	}

	@Test
	@Order(value = 5)
	@Rollback(value = false)
	public void deleteUser() {
		User user = repsoitory.findById(1L).get();
		repsoitory.delete(user);
		Optional<User> optionalUser = repsoitory.findByNickName("abcd");
		User user1 = null;
		if (optionalUser.isPresent()) {
			user1 = optionalUser.get();
		}
		Assertions.assertThat(user1).isNull();
	}
}
