package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);

		// month
		// step1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		// step2:
		Select s = new Select(month);
		// s.selectByValue("12");
		// s.selectByVisibleText("Jul");
		s.selectByIndex(5);

		// year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s1 = new Select(year);
		s1.selectByValue("2015");

	}
}
