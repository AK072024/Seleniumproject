package testBase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Accountcreatedpage;
import pageObjects.Accountloginandregistrationpage;
import pageObjects.Homepage;
import pageObjects.Registrationpage;

public class TC01_Userregistration extends Baseclass {
	
	
	@Test
	public void verify_account_registration() {
		Homepage hp = new Homepage(driver);
		hp.clicksingupandloginlink();
		Accountloginandregistrationpage alrp = new Accountloginandregistrationpage(driver);
		alrp.enterusername("Arjuna");
		alrp.enteremail("test1266@gmail.com");
		alrp.clickSignup();
		Registrationpage rp = new Registrationpage(driver);
		rp.selectgenderTitle();
		AssertJUnit.assertEquals(rp.checkName(), "Arjuna");
		AssertJUnit.assertEquals(rp.checkemail(), "test1266@gmail.com");
		rp.setPassword("degrgewew");
		rp.enterdate("3", "March", "2021");
		rp.newletterclick();
		rp.setAddress("Arjun", "Reddy", "bangalore", "Australia", "AP", "Hyd", "560016", "8919824103");
		rp.createAccount();
		Accountcreatedpage ac= new Accountcreatedpage(driver);
		AssertJUnit.assertTrue(ac.messagepresent());
		
		
	}
	
	
	@Test
	public void verify_failure() {
		Homepage hp = new Homepage(driver);
		hp.clicksingupandloginlink();
		Accountloginandregistrationpage alrp = new Accountloginandregistrationpage(driver);
		alrp.enterusername("Arjuna");
		alrp.enteremail("Email@test.com");
		alrp.clickSignup();
	}
	@Test
	public void verify_failure1() {
		Homepage hp = new Homepage(driver);
		hp.clicksingupandloginlink();
		Accountloginandregistrationpage alrp = new Accountloginandregistrationpage(driver);
		alrp.enterusername("Arjuna Phalguna");
		alrp.enteremail("Email7894@test.com");
		alrp.getTitle();
		alrp.clickSignup();
	}

}
