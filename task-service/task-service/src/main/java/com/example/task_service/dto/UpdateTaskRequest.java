
package com.example.task_service.dto;

import com.example.task_service.model.TaskStatus;
import jakarta.validation.constraints.Size;

public record UpdateTaskRequest(
        @Size(max = 200, message = "Title must be less than 200 characters")
        String title,

        @Size(max = 500, message = "Description must be less than 500 characters")
        String description,

        TaskStatus status,

        Long assigneeId
) {}
