package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage{

	public Homepage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement signup ;
	
	
	public void clicksingupandloginlink() {
		
		signup.click();
	}

}
