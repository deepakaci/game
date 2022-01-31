package com.example.game.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.game.entity.User;

@Repository
public interface UserRepsoitory extends JpaRepository<User, Long> {

	public Optional<User> findByNickName(String nickName);
}
