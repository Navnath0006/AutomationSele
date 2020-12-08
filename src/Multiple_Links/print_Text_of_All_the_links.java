package Multiple_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_Text_of_All_the_links {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("no of links present in a webpage is: "+ links.size());
		
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		
	}
}
