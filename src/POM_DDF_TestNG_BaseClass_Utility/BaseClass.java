package POM_DDF_TestNG_BaseClass_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;

	public void browserOpen() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Software\\chromedriver_win32 (3)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
