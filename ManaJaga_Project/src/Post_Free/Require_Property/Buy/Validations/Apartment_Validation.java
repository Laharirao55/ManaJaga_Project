package Post_Free.Require_Property.Buy.Validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Apartment_Validation {

	public static void main(String[] args) throws Exception 
	{
		

		//browser initiation
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
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
			driver.findElement(By.xpath("//label[@for='n_pp_buyer']")).click();
			
		//select property for
			driver.findElement(By.xpath("//label[@for='ReqBuy']")).click();
			
		// Select next button
			driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
			
		//select property from DD
			WebElement propertytype_DD =driver.findElement(By.id("requirePropertyTypeBuyRent"));
			new Select(propertytype_DD).selectByVisibleText("Apartment");
			
			
		//Bedroom_Req field validation
			WebElement Bedroom_Req=driver.findElement(By.id("requireBedrooms"));
			boolean flag=Bedroom_Req.isDisplayed();
			System.out.println("Bedroom_Req Displayed -->" +flag);
			
		//Bathroom_Req field validation
			WebElement Bathroom_Req=driver.findElement(By.id("requireBathrooms"));
			boolean flag1=Bathroom_Req.isDisplayed();
			System.out.println("Bathroom_Req Displayed -->" +flag1);
			
		//Furniture field validation
			WebElement Furniture=driver.findElement(By.id("requireFurniture"));
			boolean flag2=Furniture.isDisplayed();
			System.out.println("Furniture Displayed -->" +flag2);
			

			//ExpectedArea field validation
				WebElement ExpectedArea=driver.findElement(By.id("req-areas-few"));
				boolean flag4=ExpectedArea.isDisplayed();
				System.out.println("ExpectedArea Displayed -->" +flag4);
				
			//Expected_Total_Area field validation
				WebElement Expected_Total_Area=driver.findElement(By.id("require-area-value"));
				boolean flag5=Expected_Total_Area.isDisplayed();
				System.out.println("Expected_Total_Area Displayed -->" +flag5);
				
			//Length field validation
				WebElement Length=driver.findElement(By.id("require-area-length"));
				boolean flag6=Length.isDisplayed();
				System.out.println("Length Displayed -->" +flag6);
				
			//Breadth field validation
				WebElement bredth=driver.findElement(By.id("require-area-bredth"));
				boolean flag7=bredth.isDisplayed();
				System.out.println("Breadth Displayed -->" +flag7);
				
			//Expecting_Face field validation
				WebElement Expecting_Face=driver.findElement(By.id("requireFacing"));
				boolean flag8=Expecting_Face.isDisplayed();
				System.out.println("Expecting_Face Displayed -->" +flag8);
				
			//OpenSides field validation
				WebElement OpenSides=driver.findElement(By.id("requireOpenSides"));
				boolean flag9=OpenSides.isDisplayed();
				System.out.println("OpenSides Displayed -->" +flag9);
				
				//TradeType field validation
					WebElement TradeType=driver.findElement(By.id("req-tradetype"));
					boolean flag10=TradeType.isDisplayed();
					System.out.println("TradeType Displayed -->" +flag10);
					
				//PropertyPermission field validation
					WebElement PropertyPermission=driver.findElement(By.id("req-permission"));
					boolean flag11=PropertyPermission.isDisplayed();
					System.out.println("PropertyPermission Displayed -->" +flag11);
					
				//GatedCommunity field validation
					WebElement GatedCommunity=driver.findElement(By.id("req-gcommunity"));
					boolean flag12=GatedCommunity.isDisplayed();
					System.out.println("GatedCommunity Displayed -->" +flag12);
					
					//ParkingAvailable field validation
					WebElement ParkingAvailable=driver.findElement(By.id("req-parking"));
					boolean flag13=ParkingAvailable.isDisplayed();
					System.out.println("ParkingAvailable Displayed -->" +flag13);
					
					//PoojaRoom field validation
						WebElement PoojaRoom=driver.findElement(By.id("req-poojaroom"));
						boolean flag14=PoojaRoom.isDisplayed();
						System.out.println("PoojaRoom Displayed -->" +flag14);
						
					//OtherRoom field validation
						WebElement OtherRoom=driver.findElement(By.id("req-otherroom"));
						boolean flag15=OtherRoom.isDisplayed();
						System.out.println("OtherRoom Displayed -->" +flag15);
						
					//Possession field validation
						WebElement Possession=driver.findElement(By.id("req-possession"));
						boolean flag16=Possession.isDisplayed();
						System.out.println("Possession Displayed -->" +flag16);
							
					//Expected_Total_price field validation
							WebElement	Expected_Total_price=driver.findElement(By.id("Req-ExpectingTotalPrice"));
							boolean flag17=	Expected_Total_price.isDisplayed();
							System.out.println("Expected_Total_price Displayed -->" +flag17);
							
					//Response from field validation
							WebElement responsefrom=driver.findElement(By.id("req-responsefrom"));
							boolean flag18=responsefrom.isDisplayed();
							System.out.println("responsefrom Displayed -->" +flag18);
						
							System.out.println("       ");
							System.out.println("'Displayed all the fields'");
							
							Thread.sleep(2000);
							driver.close();

			
	}

}
