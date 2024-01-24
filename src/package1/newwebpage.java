package package1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwebpage {
	ChromeDriver driver;
	
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/rajre/OneDrive/Desktop/.html");
	}
	@Test
	public void pagelogin()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		///to dismiss or accept the alert button
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		a.accept();
		System.out.println("alerttext="+alerttext);
		//to dismiss a.dismiss()
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("reshma");
		driver.findElement(By.xpath("//input[@name='last name']")).sendKeys("raj");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
