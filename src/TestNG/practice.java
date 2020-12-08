package TestNG;

import org.testng.annotations.Test;

public class practice {

	@Test
	public void xyz() 
	{
		System.out.println("login to system...");
	}
	
	@Test()
	public void aaa()
	{
		System.out.println("zzzz");
	}
	
	@Test(dependsOnMethods = {"xyz"} )
	public void test()
	{
		System.out.println("test...");
	}
	
}
