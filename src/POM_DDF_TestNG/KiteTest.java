package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		
		FileInputStream file =new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Sept20.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Software\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		KiteLogin1Page login1 = new KiteLogin1Page(driver);
		
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		login1.setKiteLogin1PageUN(UN);
		
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		login1.setKiteLogin1PagePWD(pwd);
		
		login1.clickKiteLogin1PageLoginButton();

		KiteLogin2Page login2 = new KiteLogin2Page(driver);
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		login2.setKiteLogin2PagePin(pin);
		
		login2.clickKiteLogin2PageContinueButton();

		KiteHomePage home = new KiteHomePage(driver);
		home.verifyKiteHomePageProfileName();

		Thread.sleep(2000);
		driver.close();
	}
}
