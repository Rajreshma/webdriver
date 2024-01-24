package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	}
	@Test
	public void draganddrop()
	{
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement destination1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source1, destination1);
		act.perform();
		
		WebElement source2=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement destination2=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		
		act.dragAndDrop(source2, destination2);
		act.perform();
		
	}
		

}
