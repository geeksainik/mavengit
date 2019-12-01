package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("this is before suite");
	}
	
	@BeforeTest
	
	public void beforetest()
	{
		System.out.println("this is before test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this is before class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is before method");
	}
	
	@Test
	
	public void test()
	{
		System.out.println("this is test");
		System.out.println("This is added to check pull");
	}


}
