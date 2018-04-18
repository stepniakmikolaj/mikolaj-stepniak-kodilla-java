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
public class ServiceFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceFacade.class);

    public List<Company> searchCompanyByName(final String value) throws ServiceFacadeException{
        List<Company> companySearchResult = companyDao.searchByThreeFirstLetters(value);
        if (companySearchResult.size() == 0) {
            LOGGER.info(ServiceFacadeException.ERR_COMPANY_NOT_FOUND);
            throw new ServiceFacadeException(ServiceFacadeException.ERR_COMPANY_NOT_FOUND);
        } else {
            return companySearchResult;
        }
    }

    public List<Employee> searchEmployeeByName(final String value) throws ServiceFacadeException{
        List<Employee> employeeSearchResult = employeeDao.searchByLastName(value);
        if (employeeSearchResult.size() == 0) {
            LOGGER.info(ServiceFacadeException.ERR_EMPLOYEE_NOT_FOUND);
            throw new ServiceFacadeException(ServiceFacadeException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            return employeeSearchResult;
        }
    }

}
