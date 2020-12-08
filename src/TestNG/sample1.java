package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {

	@Test
	public void TC1() {
	Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("running TC2",true);
	}
}
