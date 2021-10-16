package TestNG_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Java jars TQ\\Firefoxdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Java jars TQ\\Chromedriver\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("MicrosoftEdge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Java jars TQ\\MicrosoftEdgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.get("https://www.google.co.in/");
	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		Thread.sleep(2000);
	}

	@AfterClass
	public void afterTest() {
		driver.quit();
	}
}
