package com.vmp.beans;

import org.springframework.stereotype.Repository;

@Repository	
public class UserDao {


public UserDao()
{
	System.out.println("UserDao : :  Constructor");
}

public String printname(int id)
{
	if (id==101)
	{
		return "Venu";
		}
	return "madhav";
}

}
