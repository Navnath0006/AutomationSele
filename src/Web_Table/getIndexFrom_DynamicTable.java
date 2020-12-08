package Web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getIndexFrom_DynamicTable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay\\Desktop\\Study\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/html%20files/WebTable.html");

		String exp = "sql";
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
		int rowSize = row.size();

		for (int i = 2; i <= rowSize; i++) {

			int col = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[" + i + "]/td")).size();
			System.out.println(col);
			for (int j = 1; j <= col; j++) {

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
