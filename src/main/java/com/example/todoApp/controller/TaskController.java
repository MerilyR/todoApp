package com.example.todoApp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.todoApp.data.BasicTask;
import com.example.todoApp.model.TaskModel;
import com.example.todoApp.view.TaskView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController implements ActionListener{

	TaskModel model;
	TaskView view;
	
	void setModel(TaskModel model){
		this.model = model;
	}
	
	void setView(TaskView view){
		this.view = view;
		this.view.updateView();
		this.model.addTask(new BasicTask(null, "new task", "new task numero uno"));
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@RequestMapping("/todolist")
	public ModelAndView todoList(){
		return new ModelAndView ("welcome", "message", "todolist here!");
	}

}
