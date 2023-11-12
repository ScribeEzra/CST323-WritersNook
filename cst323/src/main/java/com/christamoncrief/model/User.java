package com.christamoncrief.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

public class User {

	private int id;
	@NotNull
	private String username;
	@NotNull
	private String password;
	private List<Post> myposts = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Post> getMyposts() {
		return myposts;
	}
	public void setMyposts(List<Post> myposts) {
		this.myposts = myposts;
	}
	public User() {
		this.username = "username";
		this.password = "password";
	}
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
}
