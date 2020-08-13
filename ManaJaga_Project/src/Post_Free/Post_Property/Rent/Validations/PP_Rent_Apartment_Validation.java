package Post_Free.Post_Property.Rent.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PP_Rent_Apartment_Validation {

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
					new Select(propertytype_DD).selectByVisibleText("Apartment");
		
				
					Thread.sleep(3000);
							
					//bedroom field validation
						WebElement Bedrooms=driver.findElement(By.id("bedrooms"));
						boolean flag=Bedrooms.isDisplayed();
						System.out.println("Bedrooms Displayed -->" +flag);
						
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
						
					
					//Lease Years Validation
						WebElement LeaseYears=driver.findElement(By.id("leaseYears"));
						boolean flag12=LeaseYears.isDisplayed();
						System.out.println("LeaseYears Displayed -->" +flag12);
						
					//AvailableFor Validation
						WebElement AvailableFor=driver.findElement(By.id("availableFor"));
						boolean flag13=AvailableFor.isDisplayed();
						System.out.println("AvailableFor Displayed -->" +flag13);
						
					//AvailableStatus Validation
						WebElement AvailableStatus=driver.findElement(By.id("availableStatus"));
						boolean flag14=AvailableStatus.isDisplayed();
						System.out.println("AvailableStatus Displayed -->" +flag14);
						
						
					//AttachedBathroom field validation
						WebElement AttachedBathroom=driver.findElement(By.id("post-attachedbathroom"));
						boolean flag15=AttachedBathroom.isDisplayed();
						System.out.println("AttachedBathroom Displayed -->" +flag15);
								
					//CommonBathroom field validation
						WebElement CommonBathroom=driver.findElement(By.id("post-commonbathroom"));
						boolean flag16=CommonBathroom.isDisplayed();
						System.out.println("CommonBathroom Displayed -->" +flag16);
							
						
					//PoojaRoom field validation
						WebElement PoojaRoom=driver.findElement(By.id("post-poojaroom"));
						boolean flag17=PoojaRoom.isDisplayed();
						System.out.println("PoojaRoom Displayed -->" +flag17);
								
					//Other room field validation
						WebElement OtherRoom=driver.findElement(By.id("post-otherroom"));
						boolean flag18=OtherRoom.isDisplayed();
						System.out.println("OtherRoom Displayed -->" +flag18);
								
					//Balcony Validation
						WebElement Balcony=driver.findElement(By.id("post-balcony"));
						boolean flag19=Balcony.isDisplayed();
						System.out.println("Balcony Displayed -->" +flag19);
							
					//WaterAvailability Validation
						WebElement WaterAvailability=driver.findElement(By.id("post-water"));
						boolean flag20=WaterAvailability.isDisplayed();
						System.out.println("WaterAvailability Displayed -->" +flag20);
						
					//CommonArea field validation
						WebElement CommonArea=driver.findElement(By.id("post-commonarea"));   
						boolean flag21=CommonArea.isDisplayed();
						System.out.println("CommonArea Displayed -->" +flag21);
								
					//PetsAllowed field validation
						WebElement PetsAllowed=driver.findElement(By.id("post-pets-allowed"));
						boolean flag22=PetsAllowed.isDisplayed();
						System.out.println("PetsAllowed Displayed -->" +flag22);
								
					//Watchmen field validation
						WebElement Watchmen=driver.findElement(By.id("post-watchmen"));
						boolean flag23=Watchmen.isDisplayed();
						System.out.println("Watchmen Displayed -->" +flag23);
									
					//CC Cameras field validation
						WebElement CC_Cameras=driver.findElement(By.id("post-cc-cameras"));
						boolean flag24=CC_Cameras.isDisplayed();
						System.out.println("CC_Cameras Displayed -->" +flag24);
						
					//ParkingAvailable field validation
						WebElement ParkingAvailable=driver.findElement(By.id("post-parking"));
						boolean flag25=ParkingAvailable.isDisplayed();
						System.out.println("ParkingAvailable Displayed -->" +flag25);
					
					//RentDetails field validation
						WebElement RentDetails=driver.findElement(By.id("post-rent-details"));
						boolean flag26=RentDetails.isDisplayed();
						System.out.println("RentDetails Displayed -->" +flag26);
							
					//Total price field validation
						WebElement	totalprice=driver.findElement(By.id("post-totalprice"));
						boolean flag27=	totalprice.isDisplayed();
						System.out.println("totalprice Displayed -->" +flag27);
						
					//Response from field validation
						WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
						boolean flag28=responsefrom.isDisplayed();
						System.out.println("responsefrom Displayed -->" +flag28);
							
						System.out.println("       ");
						System.out.println("'Displayed all the fields'");
						
						Thread.sleep(2000);
						driver.close();
						
				
	}

}
