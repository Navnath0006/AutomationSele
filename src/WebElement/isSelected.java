package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isSelected: this method is use to verify radio button/checkbox is selected or not.
//return type of isSelected function boolean
// if radio button/checkbox is selected then it returns true otherwise it returns false
public class isSelected {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		boolean result = female.isSelected();
		System.out.println(result); // false

		if (result == true) {
			System.out.println("radio button selected");
		} else {
			System.out.println("radio button not-selected"); // print

			System.out.println("selecting radio button"); // print
			female.click();
			boolean result1 = female.isSelected();
			if (result1 == true) {
				System.out.println("radio button selected"); // print
			} else {
				System.out.println("radio button not-selected");
			}

		}

//		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//		Thread.sleep(2000);
//		WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
//		boolean result = female.isSelected();
//		System.out.println(result);
//
//		if (result == true) {
//			System.out.println("radio button selected");
//		} else {
//			System.out.println("radio button not-selected");
//		}

	}
}
