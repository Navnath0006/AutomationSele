package Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartReviews {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement closeButton = driver.findElement(By.xpath("//div[@class='_3Njdz7']//button"));
		Thread.sleep(3000);

		if (closeButton.isDisplayed()) {
			closeButton.click();
		}

		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("red mi note 6 pro");

		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(3000);

		String reviews = driver.findElement(By.xpath("((//span[@class='_38sUEc'])[1]/span/span)[3]"))
				.getText();

		System.out.println(reviews);
	}
}
