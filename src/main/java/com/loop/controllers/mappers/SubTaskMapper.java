package com.loop.controllers.mappers;

import org.springframework.stereotype.Component;

import com.loop.controllers.beans.SubTaskBean;
import com.loop.dao.entities.SubTaskEntity;

/**
 * @author Javier
 *
 */
@Component
public class SubTaskMapper implements IMapper<SubTaskBean, SubTaskEntity> {

    @Override
    public SubTaskEntity toInner(final SubTaskBean outer) {
        if (outer == null) {
            return null;
        }
        final SubTaskEntity inner = new SubTaskEntity();
        inner.setId(outer.getId());
        inner.setName(outer.getName());
        inner.setDescription(outer.getDescription());
        inner.setStart(outer.getStart());
        inner.setEnd(outer.getEnd());
        return inner;
    }

    @Override
    public SubTaskBean toOuter(final SubTaskEntity inner) {
        if (inner == null) {
            return null;
        }
        final SubTaskBean outer = new SubTaskBean();
        outer.setId(inner.getId());
        outer.setName(inner.getName());
        outer.setDescription(inner.getDescription());
        outer.setStart(inner.getStart());
        outer.setEnd(inner.getEnd());
        return outer;
    }

}
