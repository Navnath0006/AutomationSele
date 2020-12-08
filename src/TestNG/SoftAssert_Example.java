package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Example {

	// Soft Assert using SoftAssert class
	@Test
	public void TC1() {
		Reporter.log("running TC");

		SoftAssert soft = new SoftAssert();
		String act = "abc";
		String exp = "xyz";
		soft.assertEquals(act, exp, "act and exp results are mismatch");

		soft.assertEquals(act, exp, "act and exp results are mismatch");
		
		System.out.println("executed both verifications");
		
		soft.assertAll();
	}

}
