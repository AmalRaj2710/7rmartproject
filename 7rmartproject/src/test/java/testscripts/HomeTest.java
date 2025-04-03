package testscripts;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.GeneralUtility;

public class HomeTest extends Base {

	
		LoginPage loginpage;
		HomePage homepage;
		
		
		  @Test public void verifywhetherToGetRandomNames() 
		  { 
			  loginpage=new LoginPage(driver); 
			  homepage=new HomePage(driver); 
			  loginpage.login(); 
			  String s=GeneralUtility.getRandomName(); 
			  System.out.println(s);
		  
		  }
		 
	}



