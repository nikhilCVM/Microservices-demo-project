
package com.example.task_service.repository;

import com.example.task_service.model.Task;
import com.example.task_service.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByAssigneeId(Long assigneeId);
}
