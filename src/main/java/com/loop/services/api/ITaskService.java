package com.loop.services.api;

import org.springframework.scheduling.config.Task;

import com.loop.dao.entities.TaskEntity;

/**
 * @author Hojo
 *
 */
public interface ITaskService {

    TaskEntity addTask(Task task);
}
