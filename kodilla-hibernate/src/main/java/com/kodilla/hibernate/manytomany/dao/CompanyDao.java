package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CompanyDao extends CrudRepository<Company, Integer>{
    @Query(nativeQuery = true)
    List<Company> searchByThreeFirstLetters(@Param("SUBSTRING") String substring);

    @Query
    List<Company> searchCompany(@Param("ARG") String arg);
}
