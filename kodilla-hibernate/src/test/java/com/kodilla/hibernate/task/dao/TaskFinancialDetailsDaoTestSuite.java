package com.kodilla.hibernate.task.dao;

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
public class TaskFinancialDetailsDaoTestSuite {
    @Autowired
    public TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    public void testFindByPaid(){
        //G
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();
        //W
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);
        //T
        assertEquals(1, resultList.size());
        //CleanUp
        taskFinancialDetailsDao.delete(id);
    }
}