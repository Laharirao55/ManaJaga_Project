package Post_Free.Post_Property.Sale.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class PP_Sale_Apartment_Validation 
{
	
	public static WebDriver driver;
	public static void fieldvalidation(String element){

		WebElement name = driver.findElement(By.id(element));
		
		boolean flag = name.isDisplayed();
		System.out.println(element+"  Displayed -->" +flag);
	}

	public static void main(String[] args) throws Exception 
	{
		
					
				//browser initiation
					System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
					
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
					new Select(propertytype_DD).selectByVisibleText("Apartment");
			
					
					Thread.sleep(3000);
					
				//bedroom field validation
					fieldvalidation("bedrooms");
					
//					WebElement Bedrooms=driver.findElement(By.id("bedrooms"));
//					boolean flag=Bedrooms.isDisplayed();
//					System.out.println("Bedrooms Displayed -->" +flag);
					
				//bathroom field validation
					WebElement Bathrooms=driver.findElement(By.id("post-bathrooms"));
					boolean flag1=Bathrooms.isDisplayed();
					System.out.println("Bathrooms Displayed -->" +flag1);
					
				//total floors field validation
					WebElement TotalFloors=driver.findElement(By.id("post-totalfloors"));
					boolean flag2=TotalFloors.isDisplayed();
					System.out.println("TotalFloors Displayed -->" +flag2);
					
				//floor no. field validation
					WebElement Floorno=driver.findElement(By.id("post-floorno"));
					boolean flag3=Floorno.isDisplayed();
					System.out.println("Floorno Displayed -->" +flag3);
					
				//Area field validation
					WebElement Area=driver.findElement(By.id("post-area"));
					boolean flag4=Area.isDisplayed();
					System.out.println("Area Displayed -->" +flag4);
					
				//Total Area field validation
					WebElement areavalue=driver.findElement(By.id("post-areavalue"));
					boolean flag5=areavalue.isDisplayed();
					System.out.println("areavalue Displayed -->" +flag5);
					
				//Length field validation
					WebElement Length=driver.findElement(By.id("area-length"));
					boolean flag6=Length.isDisplayed();
					System.out.println("Length Displayed -->" +flag6);
					
				//Breadth field validation
					WebElement bredth=driver.findElement(By.id("area-bredth"));
					boolean flag7=bredth.isDisplayed();
					System.out.println("Breadth Displayed -->" +flag7);
					
				//furniture field validation
					WebElement Furniture=driver.findElement(By.id("post-furniture"));
					boolean flag8=Furniture.isDisplayed();
					System.out.println("Furniture Displayed -->" +flag8);
					
				//Building Age field validation
					WebElement BuildingAge=driver.findElement(By.id("post-buildingage"));
					boolean flag9=BuildingAge.isDisplayed();
					System.out.println("BuildingAge Displayed -->" +flag9);
					
				//OpenSides field validation
					WebElement OpenSides=driver.findElement(By.id("post-opensides"));
					boolean flag10=OpenSides.isDisplayed();
					System.out.println("OpenSides Displayed -->" +flag10);
					
				//Facing field validation
					WebElement Facing=driver.findElement(By.id("post-face"));
					boolean flag11=Facing.isDisplayed();
					System.out.println("Facing Displayed -->" +flag11);
					
				//PoojaRoom field validation
					WebElement PoojaRoom=driver.findElement(By.id("post-poojaroom"));
					boolean flag12=PoojaRoom.isDisplayed();
					System.out.println("PoojaRoom Displayed -->" +flag12);
					
				//Other room field validation
					WebElement OtherRoom=driver.findElement(By.id("post-otherroom"));
					boolean flag13=OtherRoom.isDisplayed();
					System.out.println("OtherRoom Displayed -->" +flag13);
					
				//Trade type field validation
					WebElement tradetype=driver.findElement(By.id("post-tradetype"));
					boolean flag14=tradetype.isDisplayed();
					System.out.println("tradetype Displayed -->" +flag14);
					
				//Possession field validation
					WebElement possession=driver.findElement(By.id("post-possession"));
					boolean flag15=possession.isDisplayed();
					System.out.println("possession Displayed -->" +flag15);
					
				//Permission field validation
					WebElement permission=driver.findElement(By.id("post-permission"));
					boolean flag16=permission.isDisplayed();
					System.out.println("permission Displayed -->" +flag16);
					
				//gated community field validation
					WebElement gcommunity=driver.findElement(By.id("post-gcommunity"));
					boolean flag17=gcommunity.isDisplayed();
					System.out.println("gcommunity Displayed -->" +flag17);
					
				//Venture field validation
					WebElement venture=driver.findElement(By.id("post-venture"));
					boolean flag18=venture.isDisplayed();
					System.out.println("venture Displayed -->" +flag18);
					
				//parking field validation
					WebElement parking=driver.findElement(By.id("post-parking"));
					boolean flag19=parking.isDisplayed();
					System.out.println("parking Displayed -->" +flag19);
					
				//Total price field validation
					WebElement	totalprice=driver.findElement(By.id("post-totalprice"));
					boolean flag20=	totalprice.isDisplayed();
					System.out.println("totalprice Displayed -->" +flag20);
					
				//Response from field validation
					WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
					boolean flag21=responsefrom.isDisplayed();
					System.out.println("responsefrom Displayed -->" +flag21);
					
				//Url field validation
					WebElement youtube_url=driver.findElement(By.id("post-youtube-url"));
					boolean flag22= youtube_url.isDisplayed();
					System.out.println("youtube_url Displayed -->" +flag22);
					
				//Description field validation
					WebElement description=driver.findElement(By.id("post-description"));
					boolean flag23= description.isDisplayed();
					System.out.println("description Displayed -->" +flag23);
					
					System.out.println("       ");
					
					System.out.println("'Displayed all the fields'");
					
					Thread.sleep(2000);
					driver.close();
					

	}

	
	
}
