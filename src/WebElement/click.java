package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// click: click method is use to click on buttons, links
//alse use to select radio buttons & checkboxes
public class click {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("abc");

		WebElement pwd = driver.findElement(By.xpath("//input[@name='pass']"));
		pwd.sendKeys("xyz");

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();

	}
}
