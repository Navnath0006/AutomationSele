package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isDisplayed: this method is use to verify element is present on not.
//return type of isDisplayed function boolean
//if element is present then it returns true otherwise it returns exception
public class isDisplayed {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		boolean result = CreateNewAcc.isDisplayed();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("element displayed on webpage");
		}else {
			System.out.println("element not-displayed on webpage");
		}
		
		
		
		
	}
}
