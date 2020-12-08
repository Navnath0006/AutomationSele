package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WDDF {
	public static void main(String[] args) {

		// use to disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Software\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");

		// enter PWD
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");

		// click on login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();

		// enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");

		// click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();

		boolean result = driver.findElement(By.xpath("//span[text()='KV']")).isDisplayed();
		System.out.println(result);

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.close();

	}
}
