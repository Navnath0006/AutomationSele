package Web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Coloum {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/html%20files/WebTable.html");

		List<WebElement> col = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]/th"));

		System.out.println("total no of col in row 0: "+col.size());

	}
}
