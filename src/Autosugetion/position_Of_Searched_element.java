package Autosugetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class position_Of_Searched_element {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		String exp = "redmi note 8";

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		Thread.sleep(2000);

		List<WebElement> allElement = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(allElement.size());

		for (int i = 0; i <= allElement.size() - 1; i++) {

			String act = allElement.get(i).getText();
			if (act.equals(exp)) {
				System.out.println("given element " + exp + " found at position: " + (i + 1));
				break;
			}

		}

	}
}
