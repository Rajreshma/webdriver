package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerbookingcom {
	ChromeDriver driver;
	@BeforeTest
	public void urlloading()
	{
	driver=new ChromeDriver();
	driver.get("https://www.booking.com/");
	
	}
	@Test
	public void datepickertest()
	{
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[20]/div/div/div/div[1]/div[1]/div/button/span/span/svg/path")).click();
	//	datepickermethod()
	}

}
