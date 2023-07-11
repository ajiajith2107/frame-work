package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPAge {

	public WebDriver driver;

	@FindBy(xpath = "//textarea[@id='APjFqb']")
	private WebElement searchbox;

	public WebElement getSearchbox() {
		System.out.println("working2");
		return searchbox;

	}

	public LoginPAge(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
