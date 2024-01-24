package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logodisplay {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void logodisplay()
	{
	
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("logo is displayed");      ///here we use .is displayed
	                                               ///logo display use.is dispalyed
	}
	
		else
		{
			System.out.println("logo is not displayed");
		}                                                 ///.is displayed-logodisplay
	}                                                     ///.is enaabled-any button enabled
		@Test                                             ///.is selected
		public void buttontest()
		{
			WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
			boolean b=button.isEnabled();
			if(b)                                 ////here we want to show that button is enabled 
			{                                     ///or disabled
				System.out.println("button is enabled");
			}                                              ///so we use.is enabled
			else
				{
				System.out.println("button is disabled");
				
			}
		}
	
	
}
