package com.mengzhou.service;

import com.mengzhou.entities.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TaskService {

    private final Map<String, Task> tasks = new ConcurrentHashMap<>();

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task getTaskById(String id) {
        return tasks.get(id);
    }

    public Task addTask(String id, String name) {
        Task task = Task.builder()
                .id(id)
                .name(name)
                .done(false)
                .build();
        tasks.put(id, task);
        return task;
    }

    public boolean completeTask(String id) {
        Task task = tasks.get(id);
        if (task == null) {
            return false;
        }
        task.setDone(true);
        return true;
    }
}
