package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void  googlelogin()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("books",Keys.ENTER);
		//driver.findElement(By.xpath("//*[@class='gNO89b']")).click();
		driver.manage().window().maximize();
	}

}
