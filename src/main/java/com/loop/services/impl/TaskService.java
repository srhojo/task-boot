package com.loop.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loop.dao.api.ITaskDao;
import com.loop.dao.entities.TaskEntity;
import com.loop.services.api.ITaskService;

/**
 * @author Hojo
 *
 */
@Service
public class TaskService implements ITaskService {

    @Autowired
    private ITaskDao taskDao;

    @Override
    public TaskEntity addTask(final TaskEntity task) {
        return taskDao.save(task);
    }

    @Override
    public TaskEntity updateTask(final TaskEntity task) {
        return taskDao.save(task);
    }

    @Override
    public List<TaskEntity> getTask() {
        return taskDao.findAll();
    }

    @Override
    public TaskEntity getTaskById(final Long id) {
        return taskDao.findOne(id);
    }

    @Override
    public void deleteTask(final Long id) {
        taskDao.delete(id);

    }

}
