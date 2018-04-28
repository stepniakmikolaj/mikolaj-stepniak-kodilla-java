package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryFacade {
    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    public QueryFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> searchEmployee(String arg) {
        return employeeDao.searchEmployee("%" + arg + "%");
    }

    public List<Company> searchCompany(String arg) {
        return companyDao.searchCompany("%" + arg + "%");
    }

}
