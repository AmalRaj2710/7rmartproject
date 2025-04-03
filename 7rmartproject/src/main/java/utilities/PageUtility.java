package utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	public WebDriver driver;
	JavascriptExecutor js;
	public PageUtility(WebDriver driver)
	{
		this.driver=driver;
		 js=(JavascriptExecutor) 	driver;
	}
	public void jsclick(WebElement element)
	{
		js.executeScript("arguments[0].click();",element);
	}
	
	public void jsscroll(WebElement element)
	{
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void select_ByIndex(WebElement element ,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);

	}
	public void selectByVisibleText(WebElement element,String visibletext)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
	}
	public void selectByValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}	
}
