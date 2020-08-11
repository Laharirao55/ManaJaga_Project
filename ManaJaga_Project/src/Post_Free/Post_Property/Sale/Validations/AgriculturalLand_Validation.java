package Post_Free.Post_Property.Sale.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AgriculturalLand_Validation 
{


	public static void main(String[] args) throws Exception 
	{
		
			//browser initiation
				System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			//open url
				driver.get("https://manajaga.com/");
				driver.manage().window().maximize();
				
			// open post free
				driver.findElement(By.id("blink_me")).click();
				
			// Select Post Property
				driver.findElement(By.xpath("//label[@for='PostProperty']")).click();
				
			//Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]")).click();
				
			// Select I am
				driver.findElement(By.xpath("//label[@for='n_pp_owner']")).click();
				
			//select property for
				driver.findElement(By.xpath("//label[@for='Sale'][contains(.,'Sale')]")).click();
				
			// Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
				
			//select property from DD
				WebElement propertytype_DD =driver.findElement(By.id("propertyTypeSale"));
				new Select(propertytype_DD).selectByVisibleText("Agriculture Land");

			
			//Facing field validation
				WebElement Facing=driver.findElement(By.id("post-face"));
				boolean flag=Facing.isDisplayed();
				System.out.println("Facing Displayed -->" +flag);
				
			//Boundary with field validation
				WebElement BoundaryWith=driver.findElement(By.id("boundaryWith"));
				boolean flag1=BoundaryWith.isDisplayed();
				System.out.println("BoundaryWith Displayed -->" +flag1);
				
			//Now under lease field validation
				WebElement UnderLease=driver.findElement(By.xpath("//label[@for='UnderLeaseNo']"));
				boolean flag2=UnderLease.isDisplayed();
				System.out.println("UnderLease Displayed -->" +flag2);
				
			//Water availability field validation
				WebElement WaterAvailability =driver.findElement(By.xpath("//label[@for='WaterAvailabilityYes']"));
				boolean flag3 = WaterAvailability.isDisplayed();
				System.out.println("Water Availability Displayed -->" +flag3);
				
			//Total price field validation
				WebElement TotalPrice  =driver.findElement(By.id("Post-Total-Price"));
				boolean flag4=TotalPrice.isDisplayed();
				System.out.println("TotalPrice Displayed -->" +flag4);
				
			//Acres field validation
				WebElement Acres=driver.findElement(By.id("post-scres-val"));
				boolean flag5=Acres.isDisplayed();
				System.out.println("Acres Displayed -->" +flag5);
				
			//Land to main road distance field validation
				WebElement LandToMainRoaddistance=driver.findElement(By.id("post-LandToMainRoaddistance"));
				boolean flag6=LandToMainRoaddistance.isDisplayed();
				System.out.println("LandToMainRoaddistance Displayed -->" +flag6);
				
			//Metric field validation
				WebElement LandToMainRoaddistanceMetric=driver.findElement(By.id("LandToMainRoaddistanceMetric"));
				boolean flag7=LandToMainRoaddistanceMetric.isDisplayed();
				System.out.println("LandToMainRoaddistanceMetric Displayed -->" +flag7);
				
			//Soil type field validation
				WebElement soilType=driver.findElement(By.id("soilType"));
				boolean flag8=soilType.isDisplayed();
				System.out.println("soilType Displayed -->" +flag8);
				
			//Response from field validation
				WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
				boolean flag9=responsefrom.isDisplayed();
				System.out.println("responsefrom Displayed -->" +flag9);
				System.out.println("       ");
				
				System.out.println("'Displayed all the fields'");
				
				Thread.sleep(2000);
				driver.close();

				
	}

	
	
	
}
