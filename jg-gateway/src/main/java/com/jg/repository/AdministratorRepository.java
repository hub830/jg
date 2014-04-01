package com.jg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.jg.domain.Administrator;

@Repository
public interface  AdministratorRepository extends PagingAndSortingRepository<Administrator, Long>,CrudRepository<Administrator, Long>{

	Administrator findByName(String name);
}