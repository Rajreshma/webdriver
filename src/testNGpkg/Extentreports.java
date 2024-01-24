package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	                                            //extent to entry
	@BeforeTest
	public void beftest()
	{
		reporter=new ExtentHtmlReporter("./Report/myreport1.html");  ///// ./redirects to page
		reporter.config().setDocumentTitle("Automationreport1.html");
		reporter.config().setReportName("Functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows11");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("browsername", "chrome");
		driver=new ChromeDriver();


		
	}
    @BeforeMethod
    public void setup()
    {
    	driver.get(baseurl);
    }
 
   @Test
   public void fbtitleverification()
   {
	   test=extent.createTest("fbtitleverification");     ////extent.create test for seperate section
	                                                     ///categorisation
	   String Exp="facebook";
	   String Actual=driver.getTitle();       ////verify using assert
	   /////we want the details as fail or pass
	   Assert.assertEquals(Exp, Actual);
	 ///  System.out.println("hello");
   }
   @Test
   public void fblogotest()
   {
	   test=extent.createTest("fblogotest");
	   boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	   Assert.assertTrue(b);
	   
   }
  @AfterTest
  public void teardown()
  {
	  extent.flush();
  }
   
   
   
   
   
   
   
   @AfterMethod
   public void browserclose(ITestResult result)////previously executed method details
   
   {
	
	   if(result.getStatus()==ITestResult.FAILURE)
	   {
		   test.log(Status.FAIL, "test case failed is"+result.getName());
		   test.log(Status.FAIL, "test case failed is"+result.getThrowable());
		 //  String screenshotpath=screenshotmethod(driver,result.getName());
		   //test.addsScreenCaptureFromPath(screenshotpath)
		   
		   
	   }
	   else if(result.getStatus()==ITestResult.SKIP)
	   {
		 test.log(Status.SKIP, "test case skipped is "+result.getName());
		 
		   
	   }
	   else if(result.getStatus()==ITestResult.SUCCESS);
	   {
		   test.log(Status.PASS, "test case skipped is "+result.getName());  
	   }
   }
//private String screenshotmethod(WebDriver driver, String screenshotname)
//{
	
	
	//return null;
//}
 
 

}
