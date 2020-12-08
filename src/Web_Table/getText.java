package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/html%20files/WebTable.html");

	String text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[3]/td[3]")).getText();
	System.out.println(text);
	
	
	
}
}
