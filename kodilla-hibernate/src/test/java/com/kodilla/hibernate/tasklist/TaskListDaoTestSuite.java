package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
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
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LISTNAME = "LIST NAME";

    @Test
    public void testFindByListName(){
        //G
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        //W
        taskListDao.save(taskList);
        int id = taskList.getId();
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        //T
        assertEquals(1, readTaskList.size());
        //Cu
        taskListDao.delete(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks(){
        //G
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //W
        taskListDao.save(taskList);
        int id = taskList.getId();
        //T
        assertNotEquals(0, id);
        //Clean Up
        taskListDao.delete(id);
    }

    @Test
    public void testNamedQueries(){
        //G
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Make some tests", 13);

        TaskFinancialDetails taskFinancialDetails1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails taskFinancialDetails2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails taskFinancialDetails3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails taskFinancialDetails4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(taskFinancialDetails1);
        task2.setTaskFinancialDetails(taskFinancialDetails2);
        task3.setTaskFinancialDetails(taskFinancialDetails3);
        task4.setTaskFinancialDetails(taskFinancialDetails4);

        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        //W
        List<Task> longTasks = taskDao.retrieveLongTasks();
        List<Task> shortTasks = taskDao.retrieveShortTasks();
        List<Task> enoughTimeTasks = taskDao.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThanTasks = taskDao.retrieveTasksWithDurationLongerThan(6);

        //T
        try{
            assertEquals(3, longTasks.size());
            assertEquals(3, shortTasks.size());
            assertEquals(5, enoughTimeTasks.size());
            assertEquals(4, durationLongerThanTasks.size());
        } finally {
            //Clean Up
            taskListDao.delete(id);
        }
    }
}