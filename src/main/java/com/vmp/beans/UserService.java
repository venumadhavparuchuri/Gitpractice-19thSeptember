package com.vmp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired UserDao dao;
	
	

	public UserService()
	{
		System.out.println("User Service: : Constructor");
		
	}

	public String getname(int id)
	{
		return dao.printname(id);
		
	}
	
	
}
