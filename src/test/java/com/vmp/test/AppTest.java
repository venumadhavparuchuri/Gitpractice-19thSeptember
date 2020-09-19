package com.vmp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void sum()
	{
		int a =10;
		
		int b=30;
		
		int sum = a+b;
		assertEquals(40, sum);
		
	}
	
}
