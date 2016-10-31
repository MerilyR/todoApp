package com.example.todoApp.data;

import java.util.Date;

public interface Task {
		
	public boolean isDone();
	public Date getDue();
	public boolean setDone();
	public boolean setUndone();
	
}
