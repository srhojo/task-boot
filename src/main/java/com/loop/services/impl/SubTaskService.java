package com.loop.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loop.dao.api.ISubTaskDao;
import com.loop.dao.entities.SubTaskEntity;
import com.loop.services.api.ISubTaskService;

/**
 * @author Hojo
 *
 */
@Service
public class SubTaskService implements ISubTaskService {

    @Autowired
    private ISubTaskDao subTaskDao;

    @Override
    public SubTaskEntity addSubTask(final SubTaskEntity subTask) {
        return subTaskDao.save(subTask);
    }

    @Override
    public SubTaskEntity updateSubTask(final SubTaskEntity subTask) {
        return subTaskDao.save(subTask);
    }

    @Override
    public List<SubTaskEntity> getSubTask() {
        return subTaskDao.findAll();
    }

    @Override
    public SubTaskEntity getSubTaskById(final Long id) {
        return subTaskDao.findOne(id);
    }

    @Override
    public void deleteTask(final Long id) {
        subTaskDao.delete(id);

    }

}
