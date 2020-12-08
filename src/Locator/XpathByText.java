package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//tagname[text()='text value']

public class XpathByText {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");

	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
	
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
}
}
