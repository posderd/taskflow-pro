package com.taskflo.taskflo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taskflo.taskflo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}