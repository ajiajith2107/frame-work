package STEPDEFINITION;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASECLASS.Baseclass;
import HELPER.ConfigurationManager;
import HELPER.FileReaderManager;
import POM.LoginPAge;
import TESTRUNNER.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends Baseclass {

	public WebDriver driver = TestRunner.driver;



	@Given("User able to launch the application")
	public void user_able_to_launch_the_application() throws IOException {
		String url = FileReaderManager.getinstance().getcr().getURL();

		geturl(url);
	}

	@When("User enter the username {string} in Login Page")
	public void user_enter_the_username_in_login_page(String string) throws IOException {

		LoginPAge lp = new LoginPAge(driver);
		inputvaluetowebelement(string, lp.getSearchbox());
	}

	@When("User enter the password {string} in Login Page")
	public void user_enter_the_password_in_login_page(String string) {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("User Click the signin Button in Login Page")
	public void user_click_the_signin_button_in_login_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("User Verify the username {string} displayed in the header")
	public void user_verify_the_username_displayed_in_the_header(String string) {
		// Write code here that turns the phrase above into concrete actions

	}


}
