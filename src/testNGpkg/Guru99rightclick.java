package testNGpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99rightclick {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void options()
	{
		Actions act=new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	    act.contextClick(rightclick);
	    act.perform();
	    
	   WebElement editbutton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
	   editbutton.click();

	    Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext="+alerttext);
		a.accept();
		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.perform();      ///action kodukumbo eppozhum act.perform koduknm

	}
}
