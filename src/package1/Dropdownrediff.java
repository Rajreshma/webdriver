package package1;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownrediff {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void redifflogin()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		
		
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("02");
		
		
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("JAN");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2023");
		
		/////to find the count of no.of days
		List<WebElement>count=daydetails.getOptions();
		System.out.println("total no.of daydetails="+count.size());
		
		////to find the count of no.of months
		List<WebElement>count1=monthdetails.getOptions();
		System.out.println("total no.of monthdetails="+count1.size());
	
		
		
		
		
		
	}

}
