package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaoTestSuite {
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testNamedQuery(){
        //G
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarkson);
        employeeDao.save(lindaKovalsky);


        //W
        List<Employee> result = employeeDao.searchByLastName("Kovalsky");

        //T
        assertEquals(1, result.size());

        //Cup
        employeeDao.deleteAll();
    }
}