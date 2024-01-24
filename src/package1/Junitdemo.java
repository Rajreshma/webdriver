package package1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Junitdemo {
	
	ChromeDriver driver;          
	
	@Before
	public void setup()
	{

	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	@Test
	public void titleverification()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void pagesrc()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("present");
			
	
	}	
		else
		{
			System.out.println("not present");
		}
	}
	
	
	
	

	@After
	public void teardown()
	{
		driver.quit();
	}

}
