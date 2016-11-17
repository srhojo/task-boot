package com.loop.services.api;

import java.util.List;

import com.loop.dao.entities.TaskEntity;

/**
 * @author Hojo
 *
 */
public interface ITaskService {

    TaskEntity addTask(TaskEntity task);

    TaskEntity updateTask(TaskEntity task);

    List<TaskEntity> getTask();

    TaskEntity getTaskById(Long id);

    void deleteTask(Long id);

}
