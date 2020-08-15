package commonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Post_Free.Require_Property.Buy.Validations.RP_Buy_AgriculturalLand_Validation;

import org.openqa.selenium.WebDriver;
public class CommonMethods {
	//public static WebDriver driver=new ChromeDriver();
	public static void selectDD(String id,String value) throws Throwable
	{
		WebElement propertytype_DD =RP_Buy_AgriculturalLand_Validation.driver.findElement(By.id(id));
		new Select(propertytype_DD).selectByVisibleText(value);
		Thread.sleep(1000);
	}
	
}
