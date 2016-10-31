package com.example.todoApp.model;

import java.util.List;
import java.util.Observable;

import com.example.todoApp.controller.Manager;
import com.example.todoApp.data.Task;
import com.example.todoApp.data.User;

/**
 * 
 * @author Merily
 *
 */
public class TaskModel extends Observable{
	Manager taskManager;
	
	public TaskModel() {
		taskManager = new Manager();
		taskManager.loadTasks();
	}
	
	public List<User> getUsers(){
		return taskManager.getUsers();
	}
	
	public boolean addUser(User user){
		if (taskManager.add(user)) {
			notifyObservers();
			return true;
		}
		return false;
	}
	
	public List<Task> getTasks(){
		return taskManager.getTasks();
	}
	
	public void addTask(Task task){
		taskManager.add(task);
		notifyObservers();
		
	}	
}