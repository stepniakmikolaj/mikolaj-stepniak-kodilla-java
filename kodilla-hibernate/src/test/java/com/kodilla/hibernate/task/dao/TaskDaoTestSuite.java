package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave(){
        //G
        Task task = new Task(DESCRIPTION, 7);
        //W
        taskDao.save(task);
        //T
        int id = task.getId();
        Task readTask = taskDao.findOne(id);
        assertEquals(id, readTask.getId());
        //CleanUp
        taskDao.delete(id);
    }

    @Test
    public void testTaskDaoFindByDuration(){
        //G
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();
        //W
        List<Task> readTasks = taskDao.findByDuration(duration);
        //T
        assertEquals(1, readTasks.size());
        //CleanUp
        int id = readTasks.get(0).getId();
        taskDao.delete(id);
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails(){
        //G
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));
        //W
        taskDao.save(task);
        int id = task.getId();
        //T
        assertNotEquals(0, id);
        //CleanUp
        taskDao.delete(id);
    }
}