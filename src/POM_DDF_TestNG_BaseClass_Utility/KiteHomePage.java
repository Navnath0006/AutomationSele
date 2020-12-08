package POM_DDF_TestNG_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath = "//span[text()='KV']")
	private WebElement PN;

	KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyKiteHomePageProfileName() {
		boolean result = PN.isDisplayed();

		System.out.println(result);

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
