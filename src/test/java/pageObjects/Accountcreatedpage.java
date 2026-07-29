package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountcreatedpage extends Basepage{

	public Accountcreatedpage(WebDriver driver) {
		super(driver);	
	}
	
	
	@FindBy(xpath="//b[text()='Account Created!']")
	WebElement Message;



	public boolean messagepresent() {
		return Message.isDisplayed();
	}
	

}
