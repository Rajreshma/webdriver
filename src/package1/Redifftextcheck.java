package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftextcheck {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver =new ChromeDriver();	
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		}
	@Test
	public void checktext()
	{
		 String buttontext=driver.findElement(By.xpath("//*[contains(@name,'btnchkavail')]")).getAttribute("value");
		if(buttontext.equals("Check availability"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
