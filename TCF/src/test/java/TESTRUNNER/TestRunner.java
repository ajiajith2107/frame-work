package TESTRUNNER;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import BASECLASS.Baseclass;
import HELPER.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import java.io.*;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\FEature", glue = "STEPDEFINITION",

		strict = true, dryRun = false, monochrome = true, tags = "@TEST")
public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void startbrowser() throws IOException {

		// Write code here that turns the phrase above into concrete actions
		String browser = FileReaderManager.getinstance().getcr().getBrowser();

		driver = Baseclass.getBrowser(browser);

		System.out.println("test runner");
	}
}
