package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getIndexFrom_StaticTable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/html%20files/WebTable.html");

		String exp = "sql";

		for (int i = 2; i <= 5; i++) {

			for (int j = 1; j <= 3; j++) {

				String act = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(act);
				if (act.equals(exp)) {
					System.out.println("given element " + exp + " found at index " + i + "," + j);
					break;
				}

			}

		}

	}
}
