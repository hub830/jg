package com.jg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jg.domain.Users;
import com.jg.service.UsersService;

@Controller
public class HelloController {

	@Autowired
	private UsersService usersService;
	
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index() {
    	Users user = usersService.get(1);
    	System.out.println(user);
        return "index";
    }
}
