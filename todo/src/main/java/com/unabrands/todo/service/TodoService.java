package com.unabrands.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unabrands.todo.model.Todo;
import com.unabrands.todo.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	
	public Todo getTodo(Long id) {
		return repository.getById(id);
	}
	
	public Todo createTodo(Todo todo) {
		return repository.save(todo);
	}

}
