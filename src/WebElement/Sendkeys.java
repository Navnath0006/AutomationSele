package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Sendkeys: this method is use to enter value in the input field

public class Sendkeys {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");

		WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("abc");

	}
}
