package com.example.game.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class FavouriteGames {
	
	public FavouriteGames() {
		// TODO Auto-generated constructor stub
	}
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="level_id",referencedColumnName = "id" )
	private Levels level;
	
	@ManyToOne
	@JoinColumn(name = "user_id",nullable =false)
	private User  user;
	
	public long getId() {
		return id;
	}
	public Levels getLevel() {
		return level;
	}
	public void setLevel(Levels level) {
		this.level = level;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


}
