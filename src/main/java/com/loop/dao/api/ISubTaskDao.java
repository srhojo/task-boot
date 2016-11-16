package com.loop.dao.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.loop.dao.entities.SubTaskEntity;

/**
 * @author Hojo
 *
 */
public interface ISubTaskDao extends CrudRepository<SubTaskEntity, Long> {

    @Override
    List<SubTaskEntity> findAll();
}
