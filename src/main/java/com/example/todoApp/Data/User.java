package com.example.todoApp.Data;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private List<Task> tasks;
	

	public User(String name) {
		this(name, new ArrayList<Task>());
	}
	
	public User (String name, List<Task> tasks) {
		this.name = name;
		this.tasks = tasks;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void addTasks(List<Task> tasks) {
		tasks.addAll(tasks);
	}
	
	public void addTask(Task task) {
		tasks.add(task);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
