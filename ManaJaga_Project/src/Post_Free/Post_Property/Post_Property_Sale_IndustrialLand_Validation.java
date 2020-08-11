package Post_Free.Post_Property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Post_Property_Sale_IndustrialLand_Validation 
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
					new Select(propertytype_DD).selectByVisibleText("Industrial Land");
			
				
				//OpenSides field validation
					WebElement OpenSides=driver.findElement(By.id("post-opensides"));
					boolean flag=OpenSides.isDisplayed();
					System.out.println("OpenSides Displayed -->" +flag);
					
				//Facing field validation
					WebElement Facing=driver.findElement(By.id("post-face"));
					boolean flag1=Facing.isDisplayed();
					System.out.println("Facing Displayed -->" +flag1);
					
				//Lease years field validation
					WebElement Leaseyears=driver.findElement(By.id("leaseYears"));
					boolean flag2=Leaseyears.isDisplayed();
					System.out.println("Leaseyears Displayed -->" +flag2);
					
				//Permission field validation
					WebElement permission=driver.findElement(By.id("post-permission"));
					boolean flag3=permission.isDisplayed();
					System.out.println("permission Displayed -->" +flag3);
					
				//Venture field validation
					WebElement venture=driver.findElement(By.id("post-venture"));
					boolean flag4=venture.isDisplayed();
					System.out.println("venture Displayed -->" +flag4);
					
				//Total price field validation
					WebElement	totalprice=driver.findElement(By.id("post-totalprice"));
					boolean flag5=	totalprice.isDisplayed();
					System.out.println("totalprice Displayed -->" +flag5);
					
				//Response from field validation
					WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
					boolean flag6=responsefrom.isDisplayed();
					System.out.println("responsefrom Displayed -->" +flag6);
			
					System.out.println("       ");
					
					System.out.println("'Displayed all the fields'");
					
					Thread.sleep(3000);
					driver.close();
		
	}

	
}
