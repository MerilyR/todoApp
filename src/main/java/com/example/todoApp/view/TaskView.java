package com.example.todoApp.view;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.example.todoApp.data.Task;
import com.example.todoApp.model.TaskModel;

public class TaskView implements Observer{

	TaskModel model;
	
	public TaskView(TaskModel model){
		this.model = model;
		System.out.println("View created!");
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		updateView();
	}
	
	public void updateView(){
		if (model != null){
			List<Task> tasks = model.getTasks();
			System.out.println("------Tasks-------");
			System.out.println("--Nr of tasks:"+tasks.size()+"--");
			for (Task i: tasks){
				System.out.println(i);
			}
			
		}
		else
			System.err.println("View not updated!");
	}
	
}
