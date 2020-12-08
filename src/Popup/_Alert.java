package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Alert {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();

		System.out.println(alt.getText());

		alt.accept();

	}
}
