package testNGpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngfeatureseg {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println("browser open");
	}
   @BeforeMethod
   public void urlloading()
   {
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details"); 
   }
   @Test
   public void logotest()
   {
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("logo is displayed");      
	                                              
	}
	
		else
		{
			System.out.println("logo is not displayed");
		}                      
   }
   @Test
   public void buttontest()
   {
	   {
			WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
			boolean b=button.isEnabled();
			if(b)                                 
			{                                     
				System.out.println("button is enabled");
			}                                             
			else
				{
				System.out.println("button is disabled");
				
			}
		}
   }
   @Test
	public void daydetails()
	{

		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("JAN");
		
	}
   @AfterMethod
   public void aftermethod()
   {
	   System.out.println("aftermethod details");
   }
   
   @AfterTest
   public void teardown()
   {
	   System.out.println("aftertest");
   }
	
}
