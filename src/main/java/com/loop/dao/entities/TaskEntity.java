package com.loop.dao.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Hojo
 *
 */
@Entity
public class TaskEntity implements Serializable {

    private static final long serialVersionUID = 3859976736004881856L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "name", length = 150, nullable = false)
    private String description;

    @OneToMany(mappedBy = "parentTask", targetEntity = SubTaskEntity.class)
    private Set<SubTaskEntity> subtasks;

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
    public Set<SubTaskEntity> getSubtasks() {
        return subtasks;
    }

    /**
     * @param subtasks
     *            the subtasks to set
     */
    public void setSubtasks(final Set<SubTaskEntity> subtasks) {
        this.subtasks = subtasks;
    }

}
