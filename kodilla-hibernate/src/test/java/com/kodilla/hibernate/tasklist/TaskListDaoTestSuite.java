package com.kodilla.hibernate.tasklist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LISTNAME = "LIST NAME";

    @Test
    public void testFindByListName(){
        //G
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        //W
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        //T
        assertEquals(1, readTaskList.size());
        //Cu
        taskListDao.deleteAll();
    }
}