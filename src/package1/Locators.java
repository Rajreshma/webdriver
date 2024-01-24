package package1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("arya@134");
		driver.findElement(By.name("pass")).sendKeys("123467");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	

}
