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
        Employee mikolajStepniak = new Employee("Mikolaj", "Stepniak");
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarkson);
        int stephanieClarksonId = stephanieClarkson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        employeeDao.save(mikolajStepniak);
        int mikolajStepniakId = mikolajStepniak.getId();

        //W
        List<Employee> result = employeeDao.searchByLastName("Stepniak");

        //T
        assertEquals(1, result.size());

        //Cup
        employeeDao.delete(johnSmithId);
        employeeDao.delete(stephanieClarksonId);
        employeeDao.delete(lindaKovalskyId);
        employeeDao.delete(mikolajStepniakId);
    }
}