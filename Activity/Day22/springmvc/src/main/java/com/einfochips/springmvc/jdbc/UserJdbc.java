package com.einfochips.springmvc.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.einfochips.springmvc.model.User;

@Repository
public class UserJdbc {
	
	public List<User> getAllUsers(){
		
		List<User> li = new ArrayList<User>();
		li.add(new User("ji@ji.com","4567","Jimmy","820087"));
		li.add(new User("pa@pa.com","1234","Patel","96038"));
		return li;
		
	}

}
