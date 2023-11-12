package com.delaney.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delaney.todoapp.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
