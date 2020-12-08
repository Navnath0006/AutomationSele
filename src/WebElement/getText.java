package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//getText: this method is use to get text present in a webpage
//return type of getText function is String
public class getText {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement forgotAcc = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String text = forgotAcc.getText();
		System.out.println(text);

		String text1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(text);

		System.out.println(driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText());
	}
}
