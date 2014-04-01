package com.jg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.jg.domain.Users;

@Repository
public interface  UsersRepository extends PagingAndSortingRepository<Users, Long>,CrudRepository<Users, Long> {

}