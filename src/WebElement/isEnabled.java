package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isEnabled: this method is use to verify element is enebled /disabled.
// return type of isenabled function boolean
// if element is enabled then it returns true otherwise it returns false
public class isEnabled {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		boolean result = CreateNewAcc.isEnabled();
		System.out.println(result);

		if (result == true) {
			System.out.println("element enabled");
		} else {
			System.out.println("element disabled");
		}

	}
}
