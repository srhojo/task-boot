package com.loop.controllers.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loop.controllers.beans.TaskBean;
import com.loop.dao.entities.TaskEntity;

/**
 * @author Hojo
 *
 */
@Component
public class TaskMapper implements IMapper<TaskBean, TaskEntity> {

    @Autowired
    private SubTaskMapper subTaskMapper;

    @Override
    public TaskBean toOuter(final TaskEntity inner) {
        if (inner == null) {
            return null;
        }
        final TaskBean outer = new TaskBean();
        outer.setDescription(inner.getDescription());
        outer.setId(inner.getId());
        outer.setName(inner.getName());
        outer.setSubtasks(subTaskMapper.toOuter(inner.getSubtasks()));
        return outer;
    }

    @Override
    public TaskEntity toInner(final TaskBean outer) {
        if (outer == null) {
            return null;
        }
        final TaskEntity inner = new TaskEntity();
        inner.setDescription(outer.getDescription());
        inner.setId(outer.getId());
        inner.setName(outer.getName());
        return inner;
    }

}
