package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\screenshots\\xyz.jpg");
		FileHandler.copy(source, dest);

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//
//		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		String str = RandomString.make(2);
//
//		File dest = new File("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\screenshots\\xyz_" + str + ".jpg");
//		FileHandler.copy(source, dest);
//
//		// fileUtils.copyFile(source,dest);

	}
}
