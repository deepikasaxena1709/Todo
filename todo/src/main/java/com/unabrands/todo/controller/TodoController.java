package com.unabrands.todo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unabrands.todo.model.Todo;
import com.unabrands.todo.service.TodoService;


@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Todo> createTodo(@RequestBody Todo todo){
		Todo createdTodo = todoService.createTodo(todo);
		return ResponseEntity.ok(createdTodo);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Todo> getTodo(@PathVariable Long id){
		Todo todo= todoService.getTodo(id);
		return ResponseEntity.ok(todo);
	}

}
