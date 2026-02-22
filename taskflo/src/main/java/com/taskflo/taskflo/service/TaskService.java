package com.taskflo.taskflo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.taskflo.taskflo.entity.*;
import com.taskflo.taskflo.repository.TaskRepository;
import com.taskflo.taskflo.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public Task createTask(Long userId, Task task) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        task.setUser(user);
        return taskRepository.save(task);
    }

    public Page<Task> getAllTasks(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

    public List<Task> getTasksByStatus(Status status) {
        return taskRepository.findByStatus(status);
    }

    public List<Task> getTasksByPriority(Priority priority) {
        return taskRepository.findByPriority(priority);
    }
}