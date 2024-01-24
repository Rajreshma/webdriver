
package testNGpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandling {
	ChromeDriver driver;
	@BeforeTest
	public void urlloading()
	{
	driver=new ChromeDriver();	
	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/popup.php");
		
		String parentwindow=driver.getWindowHandle();  //currentwindow
		
		///System.out.println("parent window title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		
		Set<String> allwindowhandle=driver.getWindowHandles();///set of tabdetails
		///value stored in handle
		for(String handle : allwindowhandle)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd@gmail.com");
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
	}

}
