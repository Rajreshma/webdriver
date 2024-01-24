package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
		System.out.println("browser open");
	}
   @BeforeMethod
   public void urlloading()
   {
	   driver.get("https://www.facebook.com");
	   System.out.println("url loading");
   }
   @Parameters({"email","pswd"})
   @Test
   public void login(String email,String pswd)
   {
	   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
	   driver.findElement(By.xpath( "//*[@id=\"pass\"]")).sendKeys(pswd);
	 //  driver.findElement(By.xpath("//*[@id=\"u_0_5_DM\"]")).click();
	  // System.out.println("value="+email);
	  // System.out.println("value="+pswd);
   }
}
