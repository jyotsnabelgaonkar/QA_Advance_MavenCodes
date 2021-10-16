package TestNG_Codes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_fail {

	@Test	
	public void assert_fail()
	{
	String actual = "Gooooogle - Wrong string";
	System.out.println("Below assert would fail - ");
	String expected="Google";
	Assert.assertEquals(actual,expected);

	}
	
}