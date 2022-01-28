package com.example.game.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Name")
	@NotBlank (message = "User name is mandatory")
	private String name;

	@Column(name = "NickName")
	private String nickname;

	@Enumerated(EnumType.STRING)
	private Geography geoId;

	@Column
	@NotBlank (message = "Gender is mandatory")
	private String gender;

	@Column
	private long credits;

	
	@OneToMany(mappedBy = "user")
	private Set<FavouriteGames> favouriteGames;

	@OneToMany
	private Set<Games> games;

	public Geography getGeoId() {
		return geoId;
	}

	public void setGeoId(Geography geoId) {
		this.geoId = geoId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getCredits() {
		return credits;
	}

	public void setCredits(long credits) {
		this.credits = credits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
