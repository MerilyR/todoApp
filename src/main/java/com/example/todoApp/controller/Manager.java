package com.example.todoApp.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.todoApp.Data.User;

public class Manager {
	List<User> users;
	final String FILE = "";
	
	public Manager(){
		users = new ArrayList<User>();
	}
	
	public void loadTasks(){
		List<User> newUsers = loadFromFile(FILE);
		if (newUsers == null)
			newUsers = generateUsers();
		add(newUsers);
	}
	
	private List<User> generateUsers() {
		List<User> users = new ArrayList<User>();
		
		User merily = new User("Kiisu");
		User kristjan = new User("Tibu");
		
		return users;
	}

	private List<User> loadFromFile(String filestring) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(List<User> users) {
		users.addAll(users);
	}
	
	public void add(User user){
		users.add(user);
	}
}
