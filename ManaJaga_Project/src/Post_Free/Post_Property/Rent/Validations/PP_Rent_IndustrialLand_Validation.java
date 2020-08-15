package Post_Free.Post_Property.Rent.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PP_Rent_IndustrialLand_Validation 
{
	public static WebDriver driver=new ChromeDriver();
	public static void selectDD(String id,String value) throws Throwable
	{
		WebElement propertytype_DD =driver.findElement(By.id(id));
		new Select(propertytype_DD).selectByVisibleText(value);
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws Throwable
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
			driver.findElement(By.xpath("//label[@for='Rent']")).click();
			
		// Select next button
			driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
			
		//select property from DD
		//	WebElement propertytype_DD =driver.findElement(By.id("propertyTypeRent"));
		//	new Select(propertytype_DD).selectByVisibleText("Industrial Land");

			selectDD("propertyTypeRent", "Industrial Land");
			
			//Area field validation
				WebElement Area=driver.findElement(By.id("post-area"));
				boolean flag1=Area.isDisplayed();
				System.out.println("Area Displayed -->" +flag1);
				
			//Total Area field validation
				WebElement areavalue=driver.findElement(By.id("post-areavalue"));
				boolean flag2=areavalue.isDisplayed();
				System.out.println("areavalue Displayed -->" +flag2);
				
			//Length field validation
				WebElement Length=driver.findElement(By.id("area-length"));
				boolean flag3=Length.isDisplayed();
				System.out.println("Length Displayed -->" +flag3);
				
			//Breadth field validation
				WebElement bredth=driver.findElement(By.id("area-bredth"));
				boolean flag4=bredth.isDisplayed();
				System.out.println("Breadth Displayed -->" +flag4);
			
			//OpenSides field validation
				WebElement OpenSides=driver.findElement(By.id("post-opensides"));
				boolean flag5=OpenSides.isDisplayed();
				System.out.println("OpenSides Displayed -->" +flag5);
					
			//Facing field validation
				WebElement Facing=driver.findElement(By.id("post-face"));
				boolean flag6=Facing.isDisplayed();
				System.out.println("Facing Displayed -->" +flag6);
					
			//Lease years field validation
				WebElement Leaseyears=driver.findElement(By.id("leaseYears"));
				boolean flag7=Leaseyears.isDisplayed();
				System.out.println("Leaseyears Displayed -->" +flag7);
					
			//Permission field validation
				WebElement permission=driver.findElement(By.id("post-permission"));
				boolean flag8=permission.isDisplayed();
				System.out.println("permission Displayed -->" +flag8);
					
			//Venture field validation
				WebElement venture=driver.findElement(By.id("post-venture"));
				boolean flag9=venture.isDisplayed();
				System.out.println("venture Displayed -->" +flag9);
					
			//WaterAvailability Validation
				WebElement WaterAvailability=driver.findElement(By.id("post-water"));
				boolean flag10=WaterAvailability.isDisplayed();
				System.out.println("WaterAvailability Displayed -->" +flag10);
						
			//Bathroom Validation
				WebElement Bathroom=driver.findElement(By.id("post-Bathroom"));
				boolean flag11=Bathroom.isDisplayed();
				System.out.println("Bathroom Displayed -->" +flag11);
					
			//RentDetails field validation
				WebElement RentDetails=driver.findElement(By.id("post-rent-details"));
				boolean flag12=RentDetails.isDisplayed();
				System.out.println("RentDetails Displayed -->" +flag12);
								
				System.out.println("       ");
				System.out.println("'Displayed all the fields'");
				
				Thread.sleep(3000);
				driver.close();
			

	}

}
