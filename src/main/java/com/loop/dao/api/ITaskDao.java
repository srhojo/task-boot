package com.loop.dao.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.loop.dao.entities.TaskEntity;

/**
 * @author Hojo
 *
 */
public interface ITaskDao extends CrudRepository<TaskEntity, Long> {

    @Override
    List<TaskEntity> findAll();

}
