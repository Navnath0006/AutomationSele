package CustomizeD_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Actions act = new Actions(driver);

		act.click(month).perform();
		Thread.sleep(2000);

		// move to top
		for (int i = 1; i <= 12; i++) {
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}

		// navigate to may option
		for (int i = 1; i <= 4; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}

		act.sendKeys(Keys.ENTER).perform();

	}
}
