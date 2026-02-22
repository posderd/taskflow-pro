package com.taskflo.taskflo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.taskflo.taskflo.entity.*;
import com.taskflo.taskflo.service.TaskService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping("/{userId}")
    public Task createTask(@PathVariable Long userId,
                           @RequestBody Task task) {
        return taskService.createTask(userId, task);
    }

    @GetMapping
    public Page<Task> getAllTasks(Pageable pageable) {
        return taskService.getAllTasks(pageable);
    }

    @GetMapping("/status/{status}")
    public List<Task> getByStatus(@PathVariable Status status) {
        return taskService.getTasksByStatus(status);
    }

    @GetMapping("/priority/{priority}")
    public List<Task> getByPriority(@PathVariable Priority priority) {
        return taskService.getTasksByPriority(priority);
    }
}