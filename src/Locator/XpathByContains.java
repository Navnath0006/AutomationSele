package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//tagname[contains(@attributeName,'attribute value')]  -- using attribute
//tagname[contains(text(),'text value')]    -- using text

public class XpathByContains {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();

		// driver.findElement(By.xpath("//button[contains(@name,'log')]")).click();

	}
}
