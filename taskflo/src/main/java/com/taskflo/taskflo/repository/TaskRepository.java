package com.taskflo.taskflo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taskflo.taskflo.entity.Task;
import com.taskflo.taskflo.entity.Status;
import com.taskflo.taskflo.entity.Priority;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(Status status);

    List<Task> findByPriority(Priority priority);

    List<Task> findByUserId(Long userId);
}