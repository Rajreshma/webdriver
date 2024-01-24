package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Comparingurl {
	ChromeDriver driver;
	
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
@Test
public void uurlcomparing()
{
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	String expurl="https://practicetestautomation.com/logged-in-successfully/";
	
	String actualurl=driver.getCurrentUrl();
	
	Assert.assertEquals(actualurl,expurl);
	
	System.out.println("hello");
}
}
