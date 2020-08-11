package Post_Free.Post_Property.Sale.Validations;

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
				driver.findElement(By.xpath("//label[@for='Sale'][contains(.,'Sale')]")).click();
				
			// Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
				
			//select property from DD
				WebElement propertytype_DD =driver.findElement(By.id("propertyTypeSale"));
				new Select(propertytype_DD).selectByVisibleText("Commercial Plot");
				
				
				
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
				
			//Boundary with field validation
				WebElement BoundaryWith=driver.findElement(By.id("boundaryWith"));
				boolean flag6=BoundaryWith.isDisplayed();
				System.out.println("BoundaryWith Displayed -->" +flag6);
				
			//Lease years field validation
				WebElement Leaseyears=driver.findElement(By.id("leaseYears"));
				boolean flag7=Leaseyears.isDisplayed();
				System.out.println("Leaseyears Displayed -->" +flag7);
				
			//Venture validation
				WebElement venture=driver.findElement(By.id("post-venture"));
				boolean flag8= venture.isDisplayed();
				System.out.println("Venture Displayed -->" +flag8);
				
			//Total price field validation
				WebElement	totalprice=driver.findElement(By.id("post-totalprice"));
				boolean flag9=	totalprice.isDisplayed();
				System.out.println("totalprice Displayed -->" +flag9);
				
			//Response from field validation
				WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
				boolean flag10=responsefrom.isDisplayed();
				System.out.println("responsefrom Displayed -->" +flag10);
			
				System.out.println("       ");
				
				System.out.println("'Displayed all the fields'");
				
				Thread.sleep(2000);
				driver.close();

	}
	
	
}
