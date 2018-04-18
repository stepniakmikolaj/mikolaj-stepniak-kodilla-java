package com.kodilla.hibernate.manytomany.facade;

public class ServiceFacadeException extends Exception {
    public static String ERR_COMPANY_NOT_FOUND = "Company not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Company not found";

    public ServiceFacadeException(String message) {
        super(message);
    }
}
