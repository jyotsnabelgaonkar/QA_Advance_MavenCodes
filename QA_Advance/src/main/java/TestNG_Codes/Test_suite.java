package TestNG_Codes;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_suite {

	
	@BeforeSuite
	public void before_suit()
	{
		System.out.println("B E F O R E Suit executed");
	}
	
	@AfterSuite
	public void after_suite()
	{
		System.out.println("A F T E R Suite executed");
	}
	
	@Test
	public void add_cust()
	{
		System.out.println("Cusomer added successfully");
	}
	
	@Test
	public void edit_cust()
	{
		System.out.println(" Customer edited ");
	}
}
