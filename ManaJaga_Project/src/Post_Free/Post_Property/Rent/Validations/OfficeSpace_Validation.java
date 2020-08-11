package Post_Free.Post_Property.Rent.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OfficeSpace_Validation
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
			new Select(propertytype_DD).selectByVisibleText("Office Space");

		
			Thread.sleep(3000);

			
			//total floors field validation
				WebElement TotalFloors=driver.findElement(By.id("post-totalfloors"));
				boolean flag=TotalFloors.isDisplayed();
				System.out.println("TotalFloors Displayed -->" +flag);
				
			//floor no. field validation
				WebElement Floorno=driver.findElement(By.id("post-floorno"));
				boolean flag1=Floorno.isDisplayed();
				System.out.println("Floorno Displayed -->" +flag1);
				
			//Area field validation
				WebElement Area=driver.findElement(By.id("post-area"));
				boolean flag2=Area.isDisplayed();
				System.out.println("Area Displayed -->" +flag2);
				
			//Total Area field validation
				WebElement areavalue=driver.findElement(By.id("post-areavalue"));
				boolean flag3=areavalue.isDisplayed();
				System.out.println("areavalue Displayed -->" +flag3);
				
			//Length field validation
				WebElement Length=driver.findElement(By.id("area-length"));
				boolean flag4=Length.isDisplayed();
				System.out.println("Length Displayed -->" +flag4);
				
			//Breadth field validation
				WebElement bredth=driver.findElement(By.id("area-bredth"));
				boolean flag5=bredth.isDisplayed();
				System.out.println("Breadth Displayed -->" +flag5);
				
			//furniture field validation
				WebElement Furniture=driver.findElement(By.id("post-furniture"));
				boolean flag6=Furniture.isDisplayed();
				System.out.println("Furniture Displayed -->" +flag6);
				
				
			//OpenSides field validation
				WebElement OpenSides=driver.findElement(By.id("post-opensides"));
				boolean flag7=OpenSides.isDisplayed();
				System.out.println("OpenSides Displayed -->" +flag7);
					
			//Facing field validation
				WebElement Facing=driver.findElement(By.id("post-face"));
				boolean flag8=Facing.isDisplayed();
				System.out.println("Facing Displayed -->" +flag8);
				
			//availableStatus Validation
				WebElement availableStatus=driver.findElement(By.id("availableStatus"));
				boolean flag9=availableStatus.isDisplayed();
				System.out.println("availableStatus Displayed -->" +flag9);
			
				//WaterAvailability Validation
					WebElement WaterAvailability=driver.findElement(By.id("post-water"));
					boolean flag10=WaterAvailability.isDisplayed();
					System.out.println("WaterAvailability Displayed -->" +flag10);
					
				//Bathroom Validation
					WebElement Bathroom=driver.findElement(By.id("post-Bathroom"));
					boolean flag11=Bathroom.isDisplayed();
					System.out.println("Bathroom Displayed -->" +flag11);
					
				//Cafeteria Validation
					WebElement Cafeteria=driver.findElement(By.id("post-Cafeteria"));
					boolean flag12=Cafeteria.isDisplayed();
					System.out.println("Cafeteria Displayed -->" +flag12);
					
				//Watchmen field validation
					WebElement Watchmen=driver.findElement(By.id("post-watchmen"));
					boolean flag13=Watchmen.isDisplayed();
					System.out.println("Watchmen Displayed -->" +flag13);
									
				//CC Cameras field validation
					WebElement CC_Cameras=driver.findElement(By.id("post-cc-cameras"));
					boolean flag14=CC_Cameras.isDisplayed();
					System.out.println("CC_Cameras Displayed -->" +flag14);
										
				//RentDetails field validation
					WebElement RentDetails=driver.findElement(By.id("post-rent-details"));
					boolean flag15=RentDetails.isDisplayed();
					System.out.println("RentDetails Displayed -->" +flag15);
							
				//Response from field validation
					WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
					boolean flag16=responsefrom.isDisplayed();
					System.out.println("responsefrom Displayed -->" +flag16);						
						
					System.out.println("       ");
					System.out.println("'Displayed all the fields'");
						
					Thread.sleep(2000);
					driver.close();				
				
		

	}

}
