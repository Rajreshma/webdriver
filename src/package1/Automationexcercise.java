package package1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Automationexcercise {
	
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://automationexercise.com/login");
}


@Test
public void titletest()
{
	String actualtitle=driver.getTitle();
	System.out.println("title="+actualtitle);
	driver.quit();
	String title="Automation exercise";
	if(title.equalsIgnoreCase(title))
	{
		System.out.println("title is same");
	}
	else
	{
		System.out.println("title is not same");
	}
}
@Test
public void pagesignup()
{
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("abcdfg");
    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("abcdmwff@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
    driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("resh@123");

	WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("20");
	
	
	
	WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
	Select monthdetails=new Select(month);
	monthdetails.selectByVisibleText("June");
	
	WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	Select yeardetails=new Select(year);
	yeardetails.selectByValue("2000");
	
	
	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("abcd");
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("mwy");
	driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("company");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("address1");
	driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("address2");
	driver.findElement(By.xpath("//*[@id=\"state\"] ")).sendKeys("kerala");
	driver.findElement(By.xpath("//*[@id=\"city\"] ")).sendKeys("mukkanam");
	driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("12345");
	driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9400874088");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
}
	@After
	public void teardown()
	
	{
		driver.quit();
	}
    







}
