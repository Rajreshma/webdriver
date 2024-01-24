package testNGpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassertion {
	ChromeDriver driver;
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void titleverification()
	{
		String exp="google";
		String title=driver.getTitle();
		
		Assert.assertEquals(title, exp);     //test become failed not go to another execution 
		/////////////////////////////////////////here the execution stops
		System.out.println("hello");        ///here comparison failed and go to another section
	}

}
