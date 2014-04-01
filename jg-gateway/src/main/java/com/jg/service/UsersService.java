package com.jg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jg.domain.Users;
import com.jg.repository.UsersRepository;


/**
 * 账户服务.
 * 
 * @author hu
 * 
 */
@Component
@Transactional
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	public Users get(long id)
	{
		return usersRepository.findOne(id);
	}
	
}
