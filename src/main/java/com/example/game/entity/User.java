package com.example.game.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*[
 {
     "id": 1,
     "name": "deepak",
     "nickname": "dipu",
     "geoId": "ASIA",
     "gender": "male",
     "credits": 4,
     "geo": "ASIA"
 }
]*/



@Entity
@Table
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column
	private String nickname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="geo_id",referencedColumnName = "id" )
	private Geography geoId;
	
	@Column
	private String gender;
	
	@Column
	private long credits;
	
	@OneToMany(mappedBy = "user")
	private Set<FavouriteGames> favouriteGames;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Geography getGeoId() {
		return geoId;
	}
	public void setGeoId(Geography geoId) {
		this.geoId = geoId;
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
	public Geography getGeo() {
		return geoId;
	}
	public void setGeo(Geography geo) {
		this.geoId = geo;
	}
}
