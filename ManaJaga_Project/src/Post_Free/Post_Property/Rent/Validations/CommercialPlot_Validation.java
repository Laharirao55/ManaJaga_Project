package Post_Free.Post_Property.Rent.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommercialPlot_Validation 
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
			new Select(propertytype_DD).selectByVisibleText("Commercial Plot");

		
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
				
				
			//availableStatus Validation
				WebElement availableStatus=driver.findElement(By.id("availableStatus"));
				boolean flag6=availableStatus.isDisplayed();
				System.out.println("availableStatus Displayed -->" +flag6);
								
			//WaterAvailability Validation
				WebElement WaterAvailability=driver.findElement(By.id("post-water"));
				boolean flag7=WaterAvailability.isDisplayed();
				System.out.println("WaterAvailability Displayed -->" +flag7);
				
			//Bathroom Validation
				WebElement Bathroom=driver.findElement(By.id("post-Bathroom"));
				boolean flag8=Bathroom.isDisplayed();
				System.out.println("Bathroom Displayed -->" +flag8);
		
			//CommonArea field validation
				WebElement CommonArea=driver.findElement(By.id("post-commonarea"));   
				boolean flag9=CommonArea.isDisplayed();
				System.out.println("CommonArea Displayed -->" +flag9);
				
			//Watchmen field validation
				WebElement Watchmen=driver.findElement(By.id("post-watchmen"));
				boolean flag10=Watchmen.isDisplayed();
				System.out.println("Watchmen Displayed -->" +flag10);
								
			//CC Cameras field validation
				WebElement CC_Cameras=driver.findElement(By.id("post-cc-cameras"));
				boolean flag11=CC_Cameras.isDisplayed();
				System.out.println("CC_Cameras Displayed -->" +flag11);
									
			//RentDetails field validation
				WebElement RentDetails=driver.findElement(By.id("post-rent-details"));
				boolean flag12=RentDetails.isDisplayed();
				System.out.println("RentDetails Displayed -->" +flag12);
						
			//Response from field validation
				WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
				boolean flag13=responsefrom.isDisplayed();
				System.out.println("responsefrom Displayed -->" +flag13);						
					
				System.out.println("       ");
				System.out.println("'Displayed all the fields'");
					
				Thread.sleep(2000);
				driver.close();				
					
				
		

	}

}
