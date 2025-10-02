package com.example.Project_Blue.repository;

import com.example.Project_Blue.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
