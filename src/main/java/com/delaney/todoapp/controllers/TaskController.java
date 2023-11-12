package com.delaney.todoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.delaney.todoapp.repositories.TaskRepository;

@RestController
public class TaskController {
    
    @Autowired
    TaskRepository TaskRepository;
    
}
