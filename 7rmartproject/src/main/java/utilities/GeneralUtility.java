package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class GeneralUtility {
	 public String getattribute(WebElement element ,String attribute )
	 {
		return element.getDomAttribute(attribute) ;
	 }
 
	 public String getcssvalue(WebElement element ,String cssproperty )
	 {
		 return element.getDomAttribute(cssproperty);
	 }
	 public List<String> gettextofelements(List<WebElement> elements)
		{
		 List<String> data=new ArrayList<String>();
		 for(WebElement element:elements)
			{
				data.add(element.getText());
			}
			return data;	
		}

	 public static String getRandomName()
		{
			Faker faker=new Faker();
			return faker.name().firstName();
		}

}
