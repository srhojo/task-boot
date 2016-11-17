package com.loop.controllers.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Javier
 *
 */
public class SubTaskBean implements Serializable {

    private static final long serialVersionUID = -353455495969983785L;

    private Long id;

    @NotEmpty
    @Size(max = 150)
    private String name;

    @NotEmpty
    @Size(max = 500)
    private String description;

    private LocalDateTime start;

    private LocalDateTime end;

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
     * @return the start
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * @param start
     *            the start to set
     */
    public void setStart(final LocalDateTime start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     * @param end
     *            the end to set
     */
    public void setEnd(final LocalDateTime end) {
        this.end = end;
    }

}
