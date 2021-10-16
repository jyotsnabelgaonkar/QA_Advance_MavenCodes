package TestNG_Codes;

import org.testng.annotations.Test;

public class Dependence {

	@Test(dependsOnMethods= {"bmethod","cmethod"})
	public void amethod()
	{
		System.out.println(" a method depends on c method and d method ");
	}
	
	@Test
	public void bmethod()
	{
		System.out.println(" b method");
	}
	
	@Test
	public void cmethod()
	{
		System.out.println(" c method");
	}
	
	@Test(enabled=false)
	public void donotrunmethod()
	{
		System.out.println("Enable false");
	}
}
