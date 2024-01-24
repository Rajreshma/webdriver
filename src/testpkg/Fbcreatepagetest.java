package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepagefactory;

public class Fbcreatepagetest extends Baseclass{
	//public static WebDriver driver;
	//@BeforeTest
	//public void setup()
	//{
	///	driver=new ChromeDriver();
		////driver.get("https://www.facebook.com");
	///	driver.manage().window().maximize();
		///driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//}
	@Test
	public void createpagetest()
	{
		 Fbcreatepagefactory ob1=new  Fbcreatepagefactory(driver);
		 ob1.titleverification();
		 ob1.createpage();
		 
		 
	}
}
