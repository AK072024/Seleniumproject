package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountloginandregistrationpage extends Basepage{

	public Accountloginandregistrationpage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@data-qa='signup-name']")
	WebElement name;


	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement email;
	
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement Signup;
	
	
	public void enterusername(String username) {
		name.sendKeys(username);
		
	}
	
	public void enteremail(String useremail) {
		email.sendKeys(useremail);
	}
	
	public void clickSignup() {
		Signup.click();
	}
}

  
