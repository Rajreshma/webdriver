package package1;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	
				
	}
	@Test
	public void amazonlogin() throws Exception
	{
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("//*[@id='nav-cart-count-container']")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@class='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']")).click();
		

		
		
	
		
	}

}
