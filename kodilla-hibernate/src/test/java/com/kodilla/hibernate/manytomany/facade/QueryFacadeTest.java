package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryFacadeTest {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    QueryFacade queryFacade;

    @Test
    public void testSearchEmployee() {
        //G
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarkson);
        employeeDao.save(lindaKovalsky);

        //W
        List<Employee> result = queryFacade.searchEmployee("%val%");

        //T
        assertEquals(1, result.size());

        //Cup
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testSearchCompany() {
        //G
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //W
        List<Company> result = queryFacade.searchCompany("%ma%");

        //T
        assertEquals(3, result.size());

        //Cup
        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

}