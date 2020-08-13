package Post_Free.Require_Property.Rent.Validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RP_Rent_WareHouse_Validations 
{


	public static WebDriver driver;
	public static void fieldvalidation(String element)
	{

		WebElement name = driver.findElement(By.id(element));
		boolean flag = name.isDisplayed();
		System.out.println(element+"  Displayed -->" +flag);
	}
	
	public static void main(String[] args) throws Exception  
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
				driver.findElement(By.xpath("//label[@for='ReqRent']")).click();
			// Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
			//select property from DD
				WebElement propertytype_DD =driver.findElement(By.id("requirePropertyTypeBuyRent"));
				new Select(propertytype_DD).selectByVisibleText("Warehouse");
				Thread.sleep(1000);
				
				fieldvalidation("req-bathrooms");
				fieldvalidation("req-totalfloors");
				fieldvalidation("req-furniture");
				
				WebElement ExpectedArea = driver.findElement(By.xpath("(//div[@class='form-group col-md-3'])[5]"));
				boolean flag1 = ExpectedArea.isDisplayed();
				System.out.println("ExpectedArea  Displayed -->" +flag1);
				
				fieldvalidation("req-area-value");
				fieldvalidation("req-area-length");
				fieldvalidation("req-area-breadth");
				fieldvalidation("req-warehousefacing");
				fieldvalidation("req-opensides");
				fieldvalidation("req-waterfacility");
				fieldvalidation("req-permission");
				fieldvalidation("req-parking");
				fieldvalidation("req-expprice");
				fieldvalidation("req-responsefrom");
				
				Thread.sleep(2000);
				driver.close();
	}
	
	
	
}
