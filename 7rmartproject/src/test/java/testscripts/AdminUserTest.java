package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import dataproviders.DataProviders;
import listeners.RetryAnalyzer;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelReader;

public class AdminUserTest extends Base {
	
	AdminUserPage adminuserpage;
	HomePage homepage;
	LoginPage loginpage;
	
	@Test(groups={"smoke","regression"})
	public void verifyWhetherAdminisabletoCreateNewUser()
	{
		adminuserpage=new AdminUserPage(driver);
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		loginpage.login();
		homepage.navigateToadminUsers();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyNewButtonColor() {
		adminuserpage = new AdminUserPage(driver);
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);
		loginpage.login();
		homepage.navigateToadminUsers();
		String expectedButtonColor = "rgba(220, 53, 69, 1)";
		String actualButtonColor = adminuserpage.getButtonColor();
		System.out.println(actualButtonColor);
		Assert.assertEquals(actualButtonColor, expectedButtonColor);
	}
	
	@Test(groups="smoke")
	public void verifyWhetherNewButtonIsClickable()
	{
		adminuserpage=new AdminUserPage(driver);
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		loginpage.login();
		homepage.navigateToadminUsers();
		adminuserpage.clickOnNewButton();
	}
	
	
	@Test(groups="smoke")
	public void verify()
	{
		adminuserpage=new AdminUserPage(driver);
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		loginpage.login();
		homepage.navigateToadminUsers();
	}
	
	@Test(dataProvider = "userData", dataProviderClass = DataProviders.class)
	public void verifyWhetherAdminisAbletoAddUsers(String userName, String passWord, String userType) {
		adminuserpage = new AdminUserPage(driver);
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);
		loginpage.login();
		homepage.navigateToadminUsers();
		adminuserpage.clickOnNewButton();
		adminuserpage.enterUsernameField(userName);
		adminuserpage.enterPasswordField(passWord);
		adminuserpage.selectUserType(userType);
		adminuserpage.clickOnSaveButton();
	
}}
