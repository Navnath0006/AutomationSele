package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		WebElement closeButton = driver.findElement(By.xpath("//div[@class='_3Njdz7']//button"));
		Thread.sleep(3000);

		if (closeButton.isDisplayed()) {
			closeButton.click();
		}

		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));

		Actions act = new Actions(driver);

		act.moveToElement(login).perform();

	}
}
