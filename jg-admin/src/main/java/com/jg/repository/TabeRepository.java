package com.jg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.jg.domain.Tabe;

@Repository
public interface  TabeRepository extends PagingAndSortingRepository<Tabe, Long>,CrudRepository<Tabe, Long>{

	Tabe findByName(String name);
}