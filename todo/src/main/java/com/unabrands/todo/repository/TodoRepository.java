package com.unabrands.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unabrands.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
