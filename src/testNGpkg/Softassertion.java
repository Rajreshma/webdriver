package testNGpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Softassertion {
	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		String exp="google";
		String title=driver.getTitle();
		if(exp.equals(title))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");		
		}
		System.out.println("hello");
	}
}
