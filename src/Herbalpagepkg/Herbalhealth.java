package Herbalpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Herbalhealth {
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement healthbutton;
	
	@FindBy(xpath = "//*[@id=\"input-sort\"]")
	WebElement defaultbutton;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement sendenquiries;
	
	@FindBy(xpath = "//*[@id=\"Enquiry\"]")
	WebElement enquiry;
	
	@FindBy(xpath = "//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement sendbutton;
	
	public Herbalhealth(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void health() 
	{
		healthbutton.click();
	}
	public void droplist()
	{
		
	Select ob=new Select(defaultbutton)	;
	ob.selectByVisibleText("A-Z alphabetical order");
	}
	public void sendbutton()
	{
		sendenquiries.click();
	}
	
	public void setvalues()
	{
		enquiry.sendKeys("vbcbnvm");
	}
	public void snd()
	{
		sendbutton.click();
	}
	
}
