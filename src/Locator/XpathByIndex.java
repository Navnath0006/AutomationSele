package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//  (xpath xpression)[index]

public class XpathByIndex {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium/XpathByIndex.html");

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xyz");
	
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abc@123");
	
	driver.findElement(By.xpath("//input[@type='button']")).click();
	
	
}
}
