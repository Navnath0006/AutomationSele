package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath = "//span[text()='KV']")
	private WebElement PN;

	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getKiteHomePageProfileName() {
		String act = PN.getText();
		return act;
	}

}
