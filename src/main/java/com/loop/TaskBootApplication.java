package com.loop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loop.dao.entities.SubTaskEntity;
import com.loop.dao.entities.TaskEntity;
import com.loop.services.api.ITaskService;

@SpringBootApplication
public class TaskBootApplication {

    public static void main(final String[] args) {
        SpringApplication.run(TaskBootApplication.class, args);
    }

    @Autowired
    private ITaskService taskServices;

    @PostConstruct
    public void initBD() {
        final TaskEntity task1 = new TaskEntity();
        task1.setName("Test 1");
        task1.setDescription("descripción 1");

        final SubTaskEntity subTask1 = new SubTaskEntity();
        subTask1.setName("SubTest 1");
        subTask1.setDescription("Description sub");
        subTask1.setStart(LocalDateTime.now());
        subTask1.setEnd(LocalDateTime.now().plusDays(3));

        final List<SubTaskEntity> subtask1 = new ArrayList();
        subtask1.add(subTask1);

        task1.setSubtasks(subtask1);

        taskServices.addTask(task1);

        final TaskEntity task2 = new TaskEntity();
        task2.setName("Test 2");
        task2.setDescription("descripción 2");
        taskServices.addTask(task2);

        final TaskEntity task3 = new TaskEntity();
        task3.setName("Test 1");
        task3.setDescription("descripción 1");
        taskServices.addTask(task3);
    }
}
