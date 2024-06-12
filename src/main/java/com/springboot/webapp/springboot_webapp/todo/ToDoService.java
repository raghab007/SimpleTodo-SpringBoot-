package com.springboot.webapp.springboot_webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ToDoService {
	private  static  List<Todo>  todos = new ArrayList<Todo>();
	private static int todoCounter = 0;
	static {
		todos.add(new Todo(++todoCounter, "Raghab", "Learn DSA",
				LocalDate.now().plusYears(1), false));
		
		todos.add(new Todo(++todoCounter, "Raghab","Learn Java",
				LocalDate.now().plusYears(1), false));
		
		todos.add(new Todo(++todoCounter, "Raghab", "Learn Spring Boot",
				LocalDate.now().plusYears(1), false));
		
		todos.add(new Todo(++todoCounter, "Raghab", "Learn JavaScript", 
				LocalDate.now().plusYears(1), false));
		
		todos.add(new Todo(++todoCounter, "Raghab", "Learn DataBase",
				LocalDate.now().plusYears(1), false));
		
	}
	
	public List<Todo> findByUserName(String userName){
		
		return todos;
		 
	}
	
	public void AddTodo(Todo todo) {
		todos.add(todo);
	}
	
	public int getTodoCounter() {
		
		return ++todoCounter;
	}
	
	
	public void deleteTodo(int id) {
		Iterator<Todo> it = todos.iterator();
		while(it.hasNext()) {
			if(it.next().getId()==id) {
				it.remove();
			}
		}
			
	}
	
	public Todo findById(int id) {
		Todo todo1 = null;
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				todo1 = todo;
			}	
		}
		
	
		return todo1;
		
		
	}
	
	
	public void updateTodo(int id,String description) {
		Todo todo1 = null;
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				todo1 = todo;
			}	
		}
		todo1.setDescription(description);
		
	}
		
	

}
