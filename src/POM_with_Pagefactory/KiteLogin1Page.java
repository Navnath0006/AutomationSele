package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {

	// WebDriver driver;

	// declaration
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement UN;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement PWD;

	@FindBy(xpath = "//button[text()='Login ']")
	private WebElement login;

	// initialization
	public KiteLogin1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// usage

	public void setKiteLogin1PageUN(String username) {
		UN.sendKeys(username);
	}

	public void setKiteLogin1PagePWD(String password) {
		PWD.sendKeys(password);
	}

	public void clickKiteLogin1PageLoginButton() {
		login.click();
	}

}
