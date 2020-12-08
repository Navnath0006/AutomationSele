package Listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class printMonthOptionsInAlphabeticalOrder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(month);

		List<WebElement> options = s.getOptions();

		TreeSet tr = new TreeSet();

		for (WebElement ele : options) {
			String text = ele.getText();
			tr.add(text);
		}

		System.out.println("-------print info in alpa order-------");

		for (Object obj : tr) {
			System.out.println(obj);
		}

	}
}
