package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base {
	LoginPage loginpage;
	HomePage homepage;
	
	//@Test(groups={"smoke","regression"})
	public void verifywhetheruserisabletologinwithvalidcredentials()
	{
		
		 loginpage=new LoginPage(driver);
		 homepage=new HomePage(driver);
		 loginpage.login("admin", "admin");
		 //loginpage.login();
		 String expectedProfileName="Admin";
		 String actualProfileName=homepage.getProfileName();
		 Assert.assertEquals(actualProfileName, expectedProfileName);
		 
	}
	
	
	
	
	
	
}
