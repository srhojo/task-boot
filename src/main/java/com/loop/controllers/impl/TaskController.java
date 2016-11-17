package com.loop.controllers.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loop.controllers.beans.TaskBean;
import com.loop.controllers.mappers.TaskMapper;
import com.loop.dao.entities.TaskEntity;
import com.loop.services.api.ITaskService;

/**
 * @author Hojo
 *
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskService taskService;

    @Autowired
    private TaskMapper taskMapper;

    @RequestMapping(method = RequestMethod.GET)
    public List<TaskBean> getAll() {
        final List<TaskBean> responseList = taskMapper.toOuter(taskService.getTask());
        return responseList;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public TaskBean getById(@PathVariable("id") final Long id) {
        final TaskEntity task = taskService.getTaskById(id);
        return taskMapper.toOuter(task);
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void removeTask(@PathVariable("id") final Long id) {
        // final TaskEntity task = taskService.getTaskById(id);
        // return taskMapper.toOuter(task);
    }

    @RequestMapping(method = RequestMethod.POST)
    public TaskBean addTask(@Valid final TaskBean task) {
        final TaskEntity outerEntity = taskService.addTask(taskMapper.toInner(task));
        return taskMapper.toOuter(outerEntity);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public TaskBean updateTask(@PathVariable("id") final Long id, @Valid final TaskBean task) {
        task.setId(id);
        final TaskEntity outerEntity = taskService.updateTask(taskMapper.toInner(task));
        return taskMapper.toOuter(outerEntity);
    }

}
