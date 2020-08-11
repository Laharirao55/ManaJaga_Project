package Post_Free.Post_Property.Sale.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PentHouse_Validation 
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
				new Select(propertytype_DD).selectByVisibleText("Pent House");
		
			
				Thread.sleep(3000);
				
			//bedroom field validation
				WebElement Bedrooms=driver.findElement(By.id("bedrooms"));
				boolean flag=Bedrooms.isDisplayed();
				System.out.println("Bedrooms Displayed -->" +flag);
				
			//bathroom field validation
				WebElement Bathrooms=driver.findElement(By.id("post-bathrooms"));
				boolean flag1=Bathrooms.isDisplayed();
				System.out.println("Bathrooms Displayed -->" +flag1);
				
			//Balconies field validation
				WebElement Balconies=driver.findElement(By.id("balconies"));
				boolean flag2=Balconies.isDisplayed();
				System.out.println("Balconies Displayed -->" +flag2);
				
			//Area field validation
				WebElement Area=driver.findElement(By.id("post-area"));
				boolean flag3=Area.isDisplayed();
				System.out.println("Area Displayed -->" +flag3);
				
			//Total Area field validation
				WebElement areavalue=driver.findElement(By.id("post-areavalue"));
				boolean flag4=areavalue.isDisplayed();
				System.out.println("areavalue Displayed -->" +flag4);
				
			//Length field validation
				WebElement Length=driver.findElement(By.id("area-length"));
				boolean flag5=Length.isDisplayed();
				System.out.println("Length Displayed -->" +flag5);
				
			//Breadth field validation
				WebElement bredth=driver.findElement(By.id("area-bredth"));
				boolean flag6=bredth.isDisplayed();
				System.out.println("Breadth Displayed -->" +flag6);
				
			//furniture field validation
				WebElement Furniture=driver.findElement(By.id("post-furniture"));
				boolean flag7=Furniture.isDisplayed();
				System.out.println("Furniture Displayed -->" +flag7);
				
			//Building Age field validation
				WebElement BuildingAge=driver.findElement(By.id("post-buildingage"));
				boolean flag8=BuildingAge.isDisplayed();
				System.out.println("BuildingAge Displayed -->" +flag8);
				
			//OpenSides field validation
				WebElement OpenSides=driver.findElement(By.id("post-opensides"));
				boolean flag9=OpenSides.isDisplayed();
				System.out.println("OpenSides Displayed -->" +flag9);
				
			//Facing field validation
				WebElement Facing=driver.findElement(By.id("post-face"));
				boolean flag10=Facing.isDisplayed();
				System.out.println("Facing Displayed -->" +flag10);
				
			//PoojaRoom field validation
				WebElement PoojaRoom=driver.findElement(By.id("post-poojaroom"));
				boolean flag11=PoojaRoom.isDisplayed();
				System.out.println("PoojaRoom Displayed -->" +flag11);
				
			//Other room field validation
				WebElement OtherRoom=driver.findElement(By.id("post-otherroom"));
				boolean flag12=OtherRoom.isDisplayed();
				System.out.println("OtherRoom Displayed -->" +flag12);
				
			//Trade type field validation
				WebElement tradetype=driver.findElement(By.id("post-tradetype"));
				boolean flag13=tradetype.isDisplayed();
				System.out.println("tradetype Displayed -->" +flag13);
				
			//Possession field validation
				WebElement possession=driver.findElement(By.id("post-possession"));
				boolean flag14=possession.isDisplayed();
				System.out.println("possession Displayed -->" +flag14);
				
			//Permission field validation
				WebElement permission=driver.findElement(By.id("post-permission"));
				boolean flag15=permission.isDisplayed();
				System.out.println("permission Displayed -->" +flag15);
				
			//gated community field validation
				WebElement gcommunity=driver.findElement(By.id("post-gcommunity"));
				boolean flag16=gcommunity.isDisplayed();
				System.out.println("gcommunity Displayed -->" +flag16);
				
			//parking field validation
				WebElement parking=driver.findElement(By.id("post-parking"));
				boolean flag17=parking.isDisplayed();
				System.out.println("parking Displayed -->" +flag17);
				
			//Total price field validation
				WebElement	totalprice=driver.findElement(By.id("post-totalprice"));
				boolean flag18=	totalprice.isDisplayed();
				System.out.println("totalprice Displayed -->" +flag18);
				
			//Response from field validation
				WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
				boolean flag19=responsefrom.isDisplayed();
				System.out.println("responsefrom Displayed -->" +flag19);
				
			//Url field validation
				WebElement youtube_url=driver.findElement(By.id("post-youtube-url"));
				boolean flag20= youtube_url.isDisplayed();
				System.out.println("youtube_url Displayed -->" +flag20);
				
			//Description field validation
				WebElement description=driver.findElement(By.id("post-description"));
				boolean flag21= description.isDisplayed();
				System.out.println("description Displayed -->" +flag21);
				
				System.out.println("       ");
				
				System.out.println("'Displayed all the fields'");
				
				Thread.sleep(2000);
				driver.close();
				
	}

	
}
