package io.rishabh528.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.rishabh528.todo.entities.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo,Long> {
	//ToDoRepository interface to connect to database(ToDo as row template)
}
