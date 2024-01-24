package testNGpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Amazonwindows {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() 
	{
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		
		String title="Amazon.in:mobilephones";
		if(title.equalsIgnoreCase(title))
		{
			System.out.println("title is same");
		}
		else
		{
			System.out.println("title is not same");
		}
	
		///scrolldown
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		Set<String>allwindowhandle1=driver.getWindowHandles();
	for(String handle1 : allwindowhandle1)
		{
			if(!handle1.equalsIgnoreCase(parentwindow))
		{
				driver.switchTo().window(handle1);
				JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(0,500)");
				
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			//	driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		
	
		
			}
		
		}

	}
}

