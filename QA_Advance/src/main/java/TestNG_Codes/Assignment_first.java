package TestNG_Codes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_first {

	@BeforeSuite
	public void before_suit()
	{
		System.out.println("Before suit executed");
	}
	
	@BeforeTest
	public void before_test()
	{
		System.out.println("Before test executed");
	}
	
	@BeforeClass
	public void before_class()
	{
		System.out.println("Before class executed");
	}
	
	@BeforeMethod
	public void before_method()
	{
		System.out.println("Before method executed");
	}
	
	@Test
	public void customer_add()
	{
		System.out.println("Customer added successfully");
	}
	
	@Test
	public void edit_cust()
	{
		System.out.println("Customer edited successfully");
	}
	
	@AfterMethod
	public void after_method()
	{
		System.out.println("After method executed");
	}
	
	@AfterClass
	public void after_class()
	{
		System.out.println("After class executed");
	}
	
	@AfterTest
	public void after_test() 
	{
		System.out.println("After test executed");
	}
	
	@AfterSuite
	public void after_suit()
	{
		System.out.println("After Suit executed");
	}
	
}
