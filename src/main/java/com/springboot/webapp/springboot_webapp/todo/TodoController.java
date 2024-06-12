package com.springboot.webapp.springboot_webapp.todo;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class TodoController {
	
	private ToDoService doService;
	
	public TodoController(ToDoService doService) {
		this.doService = doService;
	}
	// to-do-list
	@RequestMapping("todoList")
	public String getTodoList(ModelMap map) {
		List<Todo> todos = doService.findByUserName(null);
		map.addAttribute("todolist",todos);
		return "todoList";
	}
	
	@RequestMapping( value = "addTodo" , method = RequestMethod.GET)
	public String showAddToDoPage(ModelMap model) {
		String userName =(String)model.getAttribute("userName");
		Todo todo1  = new Todo(0, userName, "", LocalDate.now().plusYears(1), false);
		model.addAttribute("todo", todo1);
			return "todo";	
	}
	
	@RequestMapping( value = "addTodo" , method = RequestMethod.POST)
	public String addToDo( ModelMap model, @Valid Todo todo1,BindingResult  result) {
		//Todo todo1  = new Todo(doService.getTodoCounter(),(String)map.getAttribute("userName"), description, LocalDate.now().plusYears(1), false);
		if(todo1.getId()>0) {
			
			return "redirect:updateTodo";
		}
		
		if (result.hasErrors()) {
			return "todo";
		}
		String userName =(String) model.get("userName");
		System.out.println(userName);
		todo1.setUserName(userName);
		todo1.setTargetDate(LocalDate.now().plusYears(1));
		todo1.setDone(false);
		todo1.setId(
		doService.getTodoCounter());
		doService.AddTodo(todo1);
			return "redirect:todoList";
		
	}
	@RequestMapping("deleteTodo")
	public String deleteATodo(@RequestParam int id) {
	doService.deleteTodo(id);
	return "redirect:todoList";
	}
	
	
	@RequestMapping("updateTodo")
	public String showUpdateTodoPage(@RequestParam int id,ModelMap model) {
	//doService.deleteTodo(id);
		Todo todo  = doService.findById(id);
		model.addAttribute("todo",todo);
		return "todo";
	}
	
	@RequestMapping(value = "updateTodoList", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result  ) {
		doService.updateTodo(todo.getId(), todo.getDescription());
		return "todoList";
		
	}
					
}
