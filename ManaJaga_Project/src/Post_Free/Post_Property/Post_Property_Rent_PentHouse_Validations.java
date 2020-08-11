package Post_Free.Post_Property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Post_Property_Rent_PentHouse_Validations 
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
			new Select(propertytype_DD).selectByVisibleText("Pent House");

			Thread.sleep(3000);
		
			
			//total floors field validation
				WebElement TotalFloors=driver.findElement(By.id("post-totalfloors"));
				boolean flag=TotalFloors.isDisplayed();
				System.out.println("TotalFloors Displayed -->" +flag);
				
				//OpenSides field validation
					WebElement OpenSides=driver.findElement(By.id("post-opensides"));
					boolean flag1=OpenSides.isDisplayed();
					System.out.println("OpenSides Displayed -->" +flag1);
					
				//Facing field validation
					WebElement Facing=driver.findElement(By.id("post-face"));
					boolean flag2=Facing.isDisplayed();
					System.out.println("Facing Displayed -->" +flag2);
					
				//Venture field validation
					WebElement venture=driver.findElement(By.id("post-venture"));
					boolean flag3=venture.isDisplayed();
					System.out.println("venture Displayed -->" +flag3);
						
				//RentDetails field validation
					WebElement RentDetails=driver.findElement(By.id("post-rent-details"));
					boolean flag4=RentDetails.isDisplayed();
					System.out.println("RentDetails Displayed -->" +flag4);
							
				//Response from field validation
					WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
					boolean flag5=responsefrom.isDisplayed();
					System.out.println("responsefrom Displayed -->" +flag5);
								
					System.out.println("       ");
					System.out.println("'Displayed all the fields'");
							
					Thread.sleep(2000);
					driver.close();
							
										
				
				
			
	}

}
