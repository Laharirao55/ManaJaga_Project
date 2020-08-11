package Post_Free.Post_Property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Post_Property_Rent_ResidentialPlot_Validation 
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
			driver.findElement(By.xpath("//label[@for='Rent']")).click();
			
		// Select next button
			driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
			
		//select property from DD
			WebElement propertytype_DD =driver.findElement(By.id("propertyTypeRent"));
			new Select(propertytype_DD).selectByVisibleText("Residential Plot");

			Thread.sleep(3000);
		
			//Area field validation
				WebElement Area=driver.findElement(By.id("post-areas-few"));
				boolean flag=Area.isDisplayed();
				System.out.println("Area Displayed -->" +flag);
					
			//Total Area field validation
				WebElement areavalue=driver.findElement(By.id("post-areavalue"));
				boolean flag1=areavalue.isDisplayed();
				System.out.println("areavalue Displayed -->" +flag1);
					
			//Length field validation
				WebElement Length=driver.findElement(By.id("area-length"));
				boolean flag2=Length.isDisplayed();
				System.out.println("Length Displayed -->" +flag2);
				
			//Breadth field validation
				WebElement bredth=driver.findElement(By.id("area-bredth"));
				boolean flag3=bredth.isDisplayed();
				System.out.println("Breadth Displayed -->" +flag3);
				
			//OpenSides field validation
				WebElement OpenSides=driver.findElement(By.id("post-opensides"));
				boolean flag4=OpenSides.isDisplayed();
				System.out.println("OpenSides Displayed -->" +flag4);
				
			//Facing field validation
				WebElement Facing=driver.findElement(By.id("post-face"));
				boolean flag5=Facing.isDisplayed();
				System.out.println("Facing Displayed -->" +flag5);
				
			//Venture field validation
				WebElement venture=driver.findElement(By.id("post-venture"));
				boolean flag6=venture.isDisplayed();
				System.out.println("venture Displayed -->" +flag6);
					
			//WaterAvailability Validation
				WebElement WaterAvailability=driver.findElement(By.id("post-water"));
				boolean flag7=WaterAvailability.isDisplayed();
				System.out.println("WaterAvailability Displayed -->" +flag7);
				
			//RentDetails field validation
				WebElement RentDetails=driver.findElement(By.id("post-rent-details"));
				boolean flag8=RentDetails.isDisplayed();
				System.out.println("RentDetails Displayed -->" +flag8);
						
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
