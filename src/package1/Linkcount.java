package package1;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;                            ///to count the links
	
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	
	}
	@Test
	public void countinglinks()
	{
		driver.get("https://www.facebook.com");
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("total no.of links="+linkdetails.size());
		for(WebElement element :linkdetails)
		{
			String link=element.getAttribute("href");
			String linktext=element.getText();
			
			System.out.println("link="+link);
			System.out.println("text="+linktext);
		}
		
	
				
	}
	//@After
	//public void teardown()
	//{
	//	driver.quit();
	//}
	

}
