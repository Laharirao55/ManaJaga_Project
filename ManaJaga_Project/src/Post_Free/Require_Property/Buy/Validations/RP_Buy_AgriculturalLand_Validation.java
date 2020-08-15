package Post_Free.Require_Property.Buy.Validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RP_Buy_AgriculturalLand_Validation 
{

	public static WebDriver driver=new ChromeDriver();
//	public static void selectDD(String id,String value) throws Throwable
//	{
//		WebElement propertytype_DD =driver.findElement(By.id(id));
//		new Select(propertytype_DD).selectByVisibleText(value);
//		Thread.sleep(1000);
//	}
	public static void main(String[] args) throws Exception 
	{
		

		//browser initiation
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			
		//open url
			driver.get("https://manajaga.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			
		// open post free
			driver.findElement(By.id("blink_me")).click();
			
		// Select Require Property
			driver.findElement(By.xpath("//label[@for='RequiredProperty']")).click();
			
		//Select next button
			driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]")).click();
			
		// Select I am
			driver.findElement(By.xpath("//label[@for='n_pp_buyer']")).click();
			Thread.sleep(1000);
			
		//select property for
			driver.findElement(By.xpath("//label[@for='ReqBuy']")).click();
			
		// Select next button
			driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
			
		//select property from DD
		//	WebElement propertytype_DD =driver.findElement(By.id("requirePropertyTypeBuyRent"));
		//	new Select(propertytype_DD).selectByVisibleText("Agriculture Land");
		//	Thread.sleep(1000);
			
		//	selectDD(id, value);
		
			
			//ExpectedArea field validation
				WebElement ExpectedArea=driver.findElement(By.id("req-areas-all"));
				boolean flag=ExpectedArea.isDisplayed();
				System.out.println("ExpectedArea Displayed -->" +flag);
				
			//Expected_Total_Area field validation
				WebElement Expected_Total_Area=driver.findElement(By.id("require-area-value"));
				boolean flag1=Expected_Total_Area.isDisplayed();
				System.out.println("Expected_Total_Area Displayed -->" +flag1);
				
			//Length field validation
				WebElement Length=driver.findElement(By.id("require-area-length"));
				boolean flag2=Length.isDisplayed();
				System.out.println("Length Displayed -->" +flag2);
				
			//Breadth field validation
				WebElement bredth=driver.findElement(By.id("require-area-bredth"));
				boolean flag3=bredth.isDisplayed();
				System.out.println("Breadth Displayed -->" +flag3);
				
			//Expecting_Face field validation
				WebElement Expecting_Face=driver.findElement(By.id("requireFacing"));
				boolean flag4=Expecting_Face.isDisplayed();
				System.out.println("Expecting_Face Displayed -->" +flag4);
				
			//OpenSides field validation
				WebElement OpenSides=driver.findElement(By.id("requireOpenSides"));
				boolean flag5=OpenSides.isDisplayed();
				System.out.println("OpenSides Displayed -->" +flag5);
				
			//Boundary with field validation
				WebElement BoundaryWith=driver.findElement(By.id("requireBoundaryWith"));
				boolean flag6=BoundaryWith.isDisplayed();
				System.out.println("BoundaryWith Displayed -->" +flag6);
	
				//WaterFacility validation
					WebElement WaterFacility=driver.findElement(By.id("req-waterfacility"));
					boolean flag8= WaterFacility.isDisplayed();
					System.out.println("WaterFacility Displayed -->" +flag8);
					
				//Expected_Total_price field validation
					WebElement	Expected_Total_price=driver.findElement(By.id("Req-ExpectingTotalPrice"));
					boolean flag9=	Expected_Total_price.isDisplayed();
					System.out.println("Expected_Total_price Displayed -->" +flag9);
					
				//Response from field validation
					WebElement responsefrom=driver.findElement(By.id("req-responsefrom"));
					boolean flag10=responsefrom.isDisplayed();
					System.out.println("responsefrom Displayed -->" +flag10);
				
					System.out.println("       ");
					System.out.println("'Displayed all the fields'");
					
					Thread.sleep(2000);
					driver.close();

			
	}

	
	
}
