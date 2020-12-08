package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {

	
	
	//Hard Assert using Assert class
//	@Test
//	public void TC1() {
//		Reporter.log("running TC");
//
//		String str="abc";
//		Assert.assertNotNull(str, "component is null");
//		
//		Assert.assertNull(str, "component is null");
//		
//		Assert.assertNotNull(str, "component is null");
//	}
	
	
	//7. fail
	@Test
	public void TC() {
		Reporter.log("running TC");
		Assert.fail();
	}

	// 6. assertNotNull
//	@Test
//	public void TC() {
//		Reporter.log("running TC");
//		String str="abc";
//		Assert.assertNotNull(str, "component is null");
//	}

	// 5. assertNull
//	@Test
//	public void TC() {
//		Reporter.log("running TC");
//		String str=null;
//		Assert.assertNull(str, "component is not null");
//	}

	// 4. assertFalse
//	@Test
//	public void TC() {
//		Reporter.log("running TC");
//		boolean result = true;
//		Assert.assertFalse(result, "condition is true");
//	}

	// 3. assertTrue
//	@Test
//	public void TC() {
//		Reporter.log("running TC");
//		boolean result = true;
//		Assert.assertTrue(result, "result is fail");
//	}

	// 2. assertNotEquals
//	@Test
//	public void TC() {
//		Reporter.log("running TC");
//		String act = "abc";
//		String exp = "xyz";
//
//		Assert.assertNotEquals(act, exp, "Actual & expected results are same");
//
//	}

	// 1. assertEquals
//	@Test
//	public void TC() {
//		Reporter.log("running TC");
//		String act = "abc";
//		String exp = "abc";
//
//		Assert.assertEquals(act, exp, "Actual & expected results are mismatch");
//
//	}
}
