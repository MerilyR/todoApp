package com.example.todoApp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.todoApp.data.BasicTask;
import com.example.todoApp.data.Task;
import com.example.todoApp.data.User;

/**
 * 
 * @author Merily
 * TODO make to Singleton?
 */
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

		users.addAll(Arrays.asList(new User("Kiisu"), new User("Tibu")));
		
		return users;
	}

	private List<User> loadFromFile(String filestring) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(List<User> users) {
		users.addAll(users);
		return true;
	}
	
	public boolean add(User user){
		users.add(user);
		return true;
	}

	public List<User> getUsers() {
		return users;
	}

	private User defaultUser = new User("default", generateDefaultTasks());
	
	public List<Task> getTasks() {
		return defaultUser.getTasks();
	}

	private List<Task> generateDefaultTasks() {
		List<Task> defaultTasks = new ArrayList<Task>();
		
		defaultTasks.addAll(Arrays.asList(
				new BasicTask(null, "default 1", "default task number 1"),
				new BasicTask(null, "default 2", "default task number 2"),
				new BasicTask(null, "default 3", "default task number 3")
				));
		
		return defaultTasks;
	}

	
	public void add(Task task) {
		defaultUser.addTask(task);
	}

}
