package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//1. get
		driver.get("https://www.amazon.in/");

		
		// 7.setSize
		Dimension d = new Dimension(400, 600);
		driver.manage().window().setSize(d);

		Thread.sleep(2000);
		
		//8. setPosition
		Point p = new Point(700, 900);
		driver.manage().window().setPosition(p);

		
		//6. Navigate
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

//		driver.manage().window().maximize();

		//5. getCurrentURL
		driver.get("https://www.amazon.in/");
		String url = driver.getCurrentUrl();
		System.out.println(url);

		//4. getTitle
		driver.get("https://www.amazon.in/");
		
		String exp = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String act = driver.getTitle();
		System.out.println(act);

		if (act.equals(exp)) {
			System.out.println("amazone home page opned");
		} else {
			System.out.println("amazone home page not opned");
		}

		// Thread.sleep(2000);
		// 2. close
		 driver.close();
		 //3. quite
		 driver.quit();

	}
}
