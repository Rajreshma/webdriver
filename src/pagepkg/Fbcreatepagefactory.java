package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Fbcreatepagefactory {
	WebDriver driver;
	//@FindBy(id="email")
	//WebElement fbemail;
	
	//@FindBy(xpath = "//*[@id=\\\"pass\\\"]")
	//WebElement fbpswd;
	
	//@FindBy(id="login")
   // WebElement fbloginbutton;
	
	
	@FindBy(xpath ="//*[@id=\"reg_pages_msg\"]/a")
	WebElement createpagebutton;
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	WebElement getstartedbutton;
	
	
	public Fbcreatepagefactory(WebDriver driver)
	{
		
		{
			this.driver=driver; 
	     PageFactory.initElements(driver, this);////to redirects to this page
		}
	}
	public void createpage()
	{
		createpagebutton.click();
	}
	public void titleverification()
	{
		String exp="create a page link";
		String actual=driver.getPageSource();
		
		if(actual.contains(exp))
		{
			System.out.println("text present");
		}
		else
		{
			System.out.println("text absent");
		}
		
	}
	public void getstartedbutton()
	{
		getstartedbutton.click();
	}
	
	

}
