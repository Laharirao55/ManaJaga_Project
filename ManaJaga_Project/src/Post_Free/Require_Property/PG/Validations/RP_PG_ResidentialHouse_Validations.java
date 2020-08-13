package Post_Free.Require_Property.PG.Validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RP_PG_ResidentialHouse_Validations
{

	

	public static WebDriver driver;
	public static void fieldvalidation(String element)
	{

		WebElement name = driver.findElement(By.id(element));
		boolean flag = name.isDisplayed();
		System.out.println(element+"  Displayed -->" +flag);
	}
	
	public static void main(String[] args) throws Throwable 
	{
		
			//browser initiation
				System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			//open url
				driver.get("https://manajaga.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			// open post free
				driver.findElement(By.id("blink_me")).click();
				Thread.sleep(2000);
			// Select Require Property
				driver.findElement(By.xpath("//label[@for='RequiredProperty']")).click();
			//Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]")).click();
			// Select I am
				driver.findElement(By.xpath("//label[@for='n_pp_tenant']")).click();
			//select property for
				driver.findElement(By.xpath("//label[@for='ReqPG']")).click();
			// Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
			//select property from DD
				WebElement propertytype_DD =driver.findElement(By.id("requirePropertyTypePG"));
				new Select(propertytype_DD).selectByVisibleText("Residential House");
			
			
				fieldvalidation("req-totalfloors");
				fieldvalidation("req-floorno");
				fieldvalidation("req-needfor");
				fieldvalidation("req-OccupancyRequired");
				fieldvalidation("req-pgAge");
				fieldvalidation("req-AvailableStatus");
				fieldvalidation("req-TenantsPrefer");
				fieldvalidation("req-roomsPrefer");
				fieldvalidation("req-bedsInroom");
				fieldvalidation("req-waterfacility");
				fieldvalidation("req-AttachedBathRoom");
				fieldvalidation("req-SharingBathRoom");
				fieldvalidation("req-Balcony");
				fieldvalidation("req-ccArea");
				fieldvalidation("req-meals");
				fieldvalidation("req-Laundry");
				fieldvalidation("req-Cooking");
				fieldvalidation("req-Guests");
				fieldvalidation("req-Pets");
				fieldvalidation("req-TimingRestrictions");
				fieldvalidation("req-FurnishingDetails");
				fieldvalidation("req-Watchmen");
				fieldvalidation("req-CCCameras");
				fieldvalidation("req-RentDetails");
				fieldvalidation("req-expprice");
				fieldvalidation("req-responsefrom");
				
				Thread.sleep(2000);
				driver.close();
			
				
	}
	
	
}
