package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeClass
	public void openBrobser() {
		System.out.println("open Brobser.....");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("Login to app.....");
	}

	@Test
	public void TC1() {
		System.out.println("running TC1.....");
	}
	
	@Test
	public void TC2() {
		System.out.println("running TC2.....");
	}

	@AfterMethod
	public void logoutFromApp() {
		System.out.println("logout from app.....");
	}
	
	
	@AfterClass
	public void closeBrobser() {
		System.out.println("close Brobser.....");
	}

}
