package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_with_Pagefactory.KiteHomePage;
import POM_with_Pagefactory.KiteLogin1Page;
import POM_with_Pagefactory.KiteLogin2Page;

public class KiteLoginTest {

	WebDriver driver;
	Sheet sh;

	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Sept20.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Software\\chromedriver_win32 (3)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		login1 = new KiteLogin1Page(driver);
		login2 = new KiteLogin2Page(driver);
		home = new KiteHomePage(driver);

	}

	@BeforeMethod
	public void loginToApp() {
		login1.setKiteLogin1PageUN(sh.getRow(0).getCell(0).getStringCellValue());

		login1.setKiteLogin1PagePWD(sh.getRow(0).getCell(1).getStringCellValue());

		login1.clickKiteLogin1PageLoginButton();

		login2.setKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());

		login2.clickKiteLogin2PageContinueButton();

	}

	@Test
	public void verifyPN() {
		home.verifyKiteHomePageProfileName();
	}

	@AfterMethod
	public void logoutFromApp() {

	}

	@AfterClass
	public void closeBrowser() {
		login1=null;
		login2=null;
		home=null;
		driver.close();
	}

}
