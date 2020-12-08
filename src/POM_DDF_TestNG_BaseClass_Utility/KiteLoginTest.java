package POM_DDF_TestNG_BaseClass_Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_with_Pagefactory.KiteHomePage;
import POM_with_Pagefactory.KiteLogin1Page;
import POM_with_Pagefactory.KiteLogin2Page;

public class KiteLoginTest extends BaseClass {

	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	int TCID;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		browserOpen();
		login1 = new KiteLogin1Page(driver);
		login2 = new KiteLogin2Page(driver);
		home = new KiteHomePage(driver);

	}

	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException {
		login1.setKiteLogin1PageUN(Utility.getTestData(0, 0));
		login1.setKiteLogin1PagePWD(Utility.getTestData(0, 1));
		login1.clickKiteLogin1PageLoginButton();
		login2.setKiteLogin2PagePin(Utility.getTestData(0, 2));
		login2.clickKiteLogin2PageContinueButton();
	}

	@Test
	public void verifyPN() throws EncryptedDocumentException, IOException {
		TCID = 550;
		String actText = home.getKiteHomePageProfileName();
		String expText = Utility.getTestData(0, 3);
		Assert.assertEquals(actText, expText, "act & exp results are diffrent");
	}

	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Utility.captureScreenshot(driver, TCID);
		}
	}

	@AfterClass
	public void closeBrowser() {
		login1 = null;
		login2 = null;
		home = null;
		driver.close();
	}

}
