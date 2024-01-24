package testNGpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	ChromeDriver driver;
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
				driver.get("https://www.trivago.in/");
				
	}
@Test
public void datepicker()
{
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]")).click();
	datepickermethod("March 2024","13");
}
public void datepickermethod(String exmonth, String expdate) {
	while(true)
	{
		String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
			 System.out.println(month);
		if(month.equals(exmonth))
				{
					
					break;
					
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
				}
	}
	System.out.println("date");
	List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	
	for(WebElement datelement:alldates)
	{
		String date=datelement.getText();
		System.out.println(date);
		if(date.equals(expdate))
		{
			datelement.click();
			break;
		}
	}
	
}
		
		
		
		
}
