package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	void teardown() {
		driver.quit();
	}

	

}
