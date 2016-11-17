package com.loop.controllers.mappers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hojo
 *
 */
public interface IMapper<O, I> {

    /**
     * @param outer
     * @return
     */
    I toInner(O outer);

    /**
     * @param inner
     * @return
     */
    O toOuter(I inner);

    /**
     * @param outerList
     * @return
     */
    default List<I> toInner(final List<O> outerList) {
        final List<I> innerList = new ArrayList<>();
        if (outerList != null) {
            outerList.forEach(o -> {
                innerList.add(toInner(o));
            });
        }
        return innerList;
    }

    /**
     * @param innerList
     * @return
     */
    default List<O> toOuter(final List<I> innerList) {
        final List<O> outerList = new ArrayList<>();
        if (innerList != null) {
            innerList.forEach(i -> {
                outerList.add(toOuter(i));
            });
        }
        return outerList;
    }

}
