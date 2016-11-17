package com.loop.services.api;

import java.util.List;

import com.loop.dao.entities.SubTaskEntity;

/**
 * @author Hojo
 *
 */
public interface ISubTaskService {

    SubTaskEntity addSubTask(SubTaskEntity subTask);

    SubTaskEntity updateSubTask(SubTaskEntity subTask);

    List<SubTaskEntity> getSubTask();

    SubTaskEntity getSubTaskById(Long id);

    void deleteTask(Long id);

}
