package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

	//	driver.switchTo().frame(1);  //int index
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));  // webelement
	//	driver.switchTo().frame("iframeResult");  // String name
		driver.switchTo().frame("iframeResult");  // String id
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();

		Thread.sleep(3000);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		//click on home button
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
