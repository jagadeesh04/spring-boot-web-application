package com.jag.springBoot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jag.springBoot.web.model.Todo;

@Component
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 3;
	
	static {
		todos.add(new Todo(1, "jag", "Learn Spring MVC", new Date(), false));
		todos.add(new Todo(2, "jag", "Learn Hibernate", new Date(), false));
		todos.add(new Todo(3, "jag", "Learn Micro Serivces", new Date(), false));
	}
	
	public List<Todo> retrieveTodos(String user){
		List<Todo> fileteredTodos = new ArrayList<Todo >();
		
		for(Todo todo: todos){
			if(todo.getUser().equals(user)){
				fileteredTodos.add(todo);
			}
		}
		return fileteredTodos;
	}
	
	public void addTodo(String name, String desc, Date targetDate, boolean isDone){
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}
	
	public void deleteTodo(int id){
		Iterator<Todo> iterator = todos.iterator();
		while(iterator.hasNext()){
			Todo todo = iterator.next();
			if(todo.getId() == id){
				iterator.remove();
			}
		}
	}
	
	
	
	
}
