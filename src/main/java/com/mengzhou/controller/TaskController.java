package com.mengzhou.controller;

import com.mengzhou.entities.Task;
import com.mengzhou.service.TaskService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @QueryMapping
    public List<Task> allTasks() {
        return taskService.getAllTasks();
    }

    @MutationMapping
    public Task addTask(@Argument String id, @Argument String name) {
        return taskService.addTask(id, name);
    }

    @MutationMapping
    public Boolean completeTask(@Argument String id) {
        return taskService.completeTask(id);
    }
}
