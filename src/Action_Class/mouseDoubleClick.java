package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseDoubleClick {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));

		Actions act = new Actions(driver);
//		act.moveToElement(ele).perform();
//		act.doubleClick().perform();
		
		
	//	act.moveToElement(ele).doubleClick().build().perform();
		act.doubleClick(ele).perform();
		

	}
}
