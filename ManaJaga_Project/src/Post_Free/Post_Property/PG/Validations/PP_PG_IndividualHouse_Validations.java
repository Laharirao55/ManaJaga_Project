package Post_Free.Post_Property.PG.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PP_PG_IndividualHouse_Validations 
{

	public static WebDriver driver=new ChromeDriver();
	public static void selectDD(String id,String value) throws Throwable
	{
		WebElement propertytype_DD =driver.findElement(By.id(id));
		new Select(propertytype_DD).selectByVisibleText(value);
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws Throwable 
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
				driver.findElement(By.xpath("//label[@for='PG']")).click();
				
			// Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
				
			//select property from DD
				//WebElement propertytype_DD =driver.findElement(By.id("propertyTypePG"));
				//new Select(propertytype_DD).selectByVisibleText("Individual House");
				selectDD("propertyTypePG", "Individual House");
				
		
						
				//total floors field validation
					WebElement TotalFloors=driver.findElement(By.id("post-totalfloors"));
					boolean flag=TotalFloors.isDisplayed();
					System.out.println("TotalFloors Displayed -->" +flag);
					
				//floor no. field validation
					WebElement Floorno=driver.findElement(By.id("post-floorno"));
					boolean flag1=Floorno.isDisplayed();
					System.out.println("Floorno Displayed -->" +flag1);
					
				//furniture field validation
					WebElement Furniture=driver.findElement(By.id("post-furniture"));
					boolean flag2=Furniture.isDisplayed();
					System.out.println("Furniture Displayed -->" +flag2);
						
				//AvailableFor Validation
					WebElement AvailableFor=driver.findElement(By.id("pgavailableFor"));
					boolean flag3=AvailableFor.isDisplayed();
					System.out.println("AvailableFor Displayed -->" +flag3);
					
				//Occupancy Validation
					WebElement Occupancy=driver.findElement(By.id("occupancy"));
					boolean flag4=Occupancy.isDisplayed();
					System.out.println("Occupancy Displayed -->" +flag4);
								
				//How_Old_is_PG Validation
					WebElement How_Old_is_PG=driver.findElement(By.id("pgAge"));
					boolean flag5=How_Old_is_PG.isDisplayed();
					System.out.println("How_Old_is_PG Displayed -->" +flag5);
									
				//AvailableStatus Validation
					WebElement AvailableStatus=driver.findElement(By.id("availableStatus"));
					boolean flag6=AvailableStatus.isDisplayed();
					System.out.println("AvailableStatus Displayed -->" +flag6);
							
				//TenantsPrefer Validation
						WebElement TenantsPrefer=driver.findElement(By.id("tenantsPrefer"));
						boolean flag7=TenantsPrefer.isDisplayed();
						System.out.println("TenantsPrefer Displayed -->" +flag7);
								
				//No_of_rooms_in_PG Validation
						WebElement No_of_rooms_in_PG=driver.findElement(By.id("roomsInPG"));
						boolean flag8=No_of_rooms_in_PG.isDisplayed();
						System.out.println("No_of_rooms_in_PG  Displayed -->" +flag8);
									
				//No_of_beds_in_Room Validation
						WebElement No_of_beds_in_Room=driver.findElement(By.id("bedsInRoom"));
						boolean flag9=No_of_beds_in_Room.isDisplayed();
						System.out.println("No_of_beds_in_Room Displayed -->" +flag9);
							
					//AttachedBathroom field validation
							WebElement AttachedBathroom=driver.findElement(By.id("post-attachedbathroom"));
							boolean flag10=AttachedBathroom.isDisplayed();
							System.out.println("AttachedBathroom Displayed -->" +flag10);
										
					//SharingBathroom field validation
							WebElement SharingBathroom=driver.findElement(By.id("post-sharingbathroom"));
							boolean flag11=SharingBathroom.isDisplayed();
							System.out.println("SharingBathroom Displayed -->" +flag11);
									
					//Balcony Validation
							WebElement Balcony=driver.findElement(By.id("post-balcony"));
							boolean flag12=Balcony.isDisplayed();
							System.out.println("Balcony Displayed -->" +flag12);
										
					//WaterAvailability Validation
							WebElement WaterAvailability=driver.findElement(By.id("post-water"));
							boolean flag13=WaterAvailability.isDisplayed();
							System.out.println("WaterAvailability Displayed -->" +flag13);
									
					//Meals_Included_in_Rent field validation
								WebElement Meals_Included_in_Rent=driver.findElement(By.id("post-meals"));
								boolean flag14=Meals_Included_in_Rent.isDisplayed();
								System.out.println("Meals_Included_in_Rent Displayed -->" +flag14);
											
					//Laundary_Availability field validation
								WebElement Laundary_Availability=driver.findElement(By.id("post-laundryavailable"));
								boolean flag15=Laundary_Availability.isDisplayed();
								System.out.println("Laundary_Availability Displayed -->" +flag15);
										
					//Cooking_Availability Validation
								WebElement Cooking_Availability=driver.findElement(By.id("post-cooking"));
								boolean flag16=Cooking_Availability.isDisplayed();
								System.out.println("Cooking_Availability Displayed -->" +flag16);
											
					//Guests_Allowed Validation
								WebElement Guests_Allowed=driver.findElement(By.id("post-guests"));
								boolean flag17=Guests_Allowed.isDisplayed();
								System.out.println("Guests_Allowed Displayed -->" +flag17);
								
					//CommonArea field validation
								WebElement CommonArea=driver.findElement(By.id("post-commonarea"));   
								boolean flag18=CommonArea.isDisplayed();
								System.out.println("CommonArea Displayed -->" +flag18);
											
					//PetsAllowed field validation
								WebElement PetsAllowed=driver.findElement(By.id("post-pets-allowed"));
								boolean flag19=PetsAllowed.isDisplayed();
								System.out.println("PetsAllowed Displayed -->" +flag19);
								
					//Timing_Restrictions field validation
								WebElement Timing_Restrictions=driver.findElement(By.id("post-timeRestriction"));
								boolean flag20=Timing_Restrictions.isDisplayed();
								System.out.println("Timing_Restrictions Displayed -->" +flag20);
												
					//Watchmen field validation
								WebElement Watchmen=driver.findElement(By.id("post-watchmen"));
								boolean flag21=Watchmen.isDisplayed();
								System.out.println("Watchmen Displayed -->" +flag21);
												
					//CC Cameras field validation
								WebElement CC_Cameras=driver.findElement(By.id("post-cc-cameras"));
								boolean flag22=CC_Cameras.isDisplayed();
								System.out.println("CC_Cameras Displayed -->" +flag22);
												
					//Furnishing_Details field validation
								WebElement Furnishing_Details=driver.findElement(By.id("post-furnishingdetails"));
								boolean flag23=Furnishing_Details.isDisplayed();
								System.out.println("Furnishing_Details Displayed -->" +flag23);
												
					//RentDetails field validation
								WebElement RentDetails=driver.findElement(By.id("post-rent-details"));
								boolean flag24=RentDetails.isDisplayed();
								System.out.println("RentDetails Displayed -->" +flag24);
							
					//Response from field validation
								WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
								boolean flag25=responsefrom.isDisplayed();
								System.out.println("responsefrom Displayed -->" +flag25);
										
								System.out.println("       ");
								System.out.println("'Displayed all the fields'");
									
								Thread.sleep(2000);
								driver.close();
									

		
	}

}
