package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage extends Basepage{

	public Registrationpage(WebDriver driver) {
		super(driver);
		
	}
		
	
	
	@FindBy(css="#id_gender1")
	WebElement gendertitle;
	
	@FindBy(css="#name")
	WebElement name;

	@FindBy(css="#email")
	WebElement email;
	
	@FindBy(css="#password")
	WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement day;
	
	
	@FindBy(xpath="//select[@id='months']")
	WebElement month;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement year;
	
	@FindBy(css="#newsletter")
	WebElement newslettercheckbox;
	
	@FindBy(xpath="//input[@data-qa='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@data-qa='last_name']")
	WebElement lastname;
		
	@FindBy(css="#address1")
	WebElement address;
	
	@FindBy(css="#country")
	WebElement country;
	
	@FindBy(css="#state")
	WebElement state;
	
	@FindBy(css="#city")
	WebElement city;
	
	@FindBy(css="#zipcode")
	WebElement zipcode;
	
	@FindBy(css="#mobile_number")
	WebElement mobilenumber;
	
	@FindBy(xpath="//button[text()='Create Account']")
	WebElement submit;
	
	
	public void selectgenderTitle() {
		gendertitle.click();
	}
	
	public String checkName() {
	    return name.getDomProperty("value");
	}
	
	public String checkemail() {
	    return email.getDomProperty("value");
	}
	
	public void setPassword(String passwordvalue) {
		password.sendKeys(passwordvalue);
	}
	
	public void enterdate(String d,String m, String y) {
		new Select(day).selectByVisibleText(d);
		new Select(month).selectByVisibleText(m);
		new Select(year).selectByVisibleText(y);
			
	}
	
	public void newletterclick() {
		newslettercheckbox.click();
	}
	
    public void setAddress(String fname, String lname, String address1, String countr, String stat, String c, String z,String M) {
    	
    	firstname.sendKeys(fname);
    	lastname.sendKeys(lname);
    	address.sendKeys(address1);
    	new Select(country).selectByVisibleText(countr); 
    	state.sendKeys(stat);
    	city.sendKeys(c);
    	zipcode.sendKeys(z);
    	mobilenumber.sendKeys(M);
    	
    	} 
    
    public void createAccount() {
    	submit.click();
    }
	
}
