package com.jag.springBoot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jag.springBoot.web.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method= RequestMethod.GET)
	public String showTodos(ModelMap model){
		model.put("todos", service.retrieveTodos("jag"));
		return "list-dotos";
	}
	
}
