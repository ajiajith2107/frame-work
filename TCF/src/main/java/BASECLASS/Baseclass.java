package BASECLASS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browser)

	{

		if (browser.equals("chrome")) {

			ChromeDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {

			ChromeDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		return driver;
	}

	public static void geturl(String url) {

		driver.get(url);

	}

	public static void inputvaluetowebelement(String args, WebElement element)

	{
		System.out.println("working");
		element.sendKeys(args);

	}
}
