package com.example.todoApp.Data;

import java.util.Date;

public interface Task {
		
	public boolean isDone();
	public Date getDue();
	public boolean setDone();
	public boolean setUndone();
	
}
