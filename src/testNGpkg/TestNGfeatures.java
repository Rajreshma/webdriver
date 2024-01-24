package testNGpkg;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;         
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGfeatures {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
		
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("urlloading");
	}
	@Test(priority=3,groups= {"sanity","smoke"}) //////////invoction count=3
	public void test1()                           /////
	{
		System.out.println("test1");
	}
	@Test(priority=1,groups= {"smoke"})          //here test 2 is not enabled
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=2,groups={"regression"})             ///here priority is more to depends on 
	public void test3()                                       //methods than priority
	{                                                      
		System.out.println("test3");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethoddetails");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("quit");
	}
}
