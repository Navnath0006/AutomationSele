package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");

		Thread.sleep(2000);

		String addressOfMainPage = driver.getWindowHandle();
		System.out.println("main page ID:  " + addressOfMainPage);

		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);

		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);

		ArrayList<String> al = new ArrayList<String>(ids);

		Thread.sleep(2000);
		driver.switchTo().window(al.get(0));
		// driver.close();
		driver.quit();

	}
}
