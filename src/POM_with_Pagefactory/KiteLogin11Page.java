package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin11Page {

	// declaration

	@FindBy(xpath = "")
	private WebElement UN;

	@FindBy(xpath = "")
	private WebElement pwd;

	@FindBy(xpath = "")
	private WebElement login;

	// initialization
	public KiteLogin11Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// usage

	public void clickKiteLogin11PageLogin() {
		login.sendKeys("");
	}

	public void setKiteLogin11PageUN() {
		UN.sendKeys("");
	}

	public void setKiteLogin11PagePWD() {
		pwd.sendKeys("");
	}

}
