package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/sanjay/AppData/Local/Google/Chrome/User Data/Default");
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// 1. get
		driver.get("https://meet.google.com/");

		WebElement newMeeting = driver.findElement(By.xpath("//span[text()='New meeting']"));
		int cnt = 1;
		while (cnt <= 10) {
			try {
				newMeeting.click();
				break;
			} catch (Exception e) {
				System.out.println("element not found: New Meeting");
			}
			Thread.sleep(5000);
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Get a meeting link to share']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='XuQwKc']/span/span")).click();

		driver.get("https://web.whatsapp.com/");

		Thread.sleep(5000);

	}
}
