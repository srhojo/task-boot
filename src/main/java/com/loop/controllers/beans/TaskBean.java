package com.loop.controllers.beans;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Javier
 *
 */
public class TaskBean implements Serializable {

    private static final long serialVersionUID = -1806154691303967138L;

    private Long id;

    @NotEmpty
    @Size(max = 150)
    private String name;

    @Size(max = 500)
    private String description;

    private List<SubTaskBean> subtasks;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @return the subtasks
     */
    public List<SubTaskBean> getSubtasks() {
        return subtasks;
    }

    /**
     * @param subtasks
     *            the subtasks to set
     */
    public void setSubtasks(final List<SubTaskBean> subtasks) {
        this.subtasks = subtasks;
    }

}
