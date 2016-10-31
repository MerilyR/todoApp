package com.example.todoApp.data;

import java.util.Calendar;
import java.util.Date;

public class BasicTask implements Task{

	Date created;
	String title;
	String description;
	
	public BasicTask (Date due, String title, String desc) {
		created = Calendar.getInstance().getTime();
		this.due = due;
		this.title = title;
		this.description = desc;
	}
		
	private boolean done = false;
	Date due;
	
	/**
	 * Implemented methods
	 */
	
	public boolean isDone() {
		return done;
	}

	public Date getDue() {
		return due;
	}

	public boolean setDone() {
		done = true;
		return isDone();
	}

	public boolean setUndone() {
		done = false;
		return isDone();
	}
	
}
