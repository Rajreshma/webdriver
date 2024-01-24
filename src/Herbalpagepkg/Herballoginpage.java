package Herbalpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Herballoginpage {
	WebDriver driver;
	@FindBy(xpath ="//*[@id=\"top-links\"]/ul/li[1]/a/i")
	WebElement myaccountclick;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
	WebElement loginclick;
	
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
	WebElement herbalemail;
	
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement herbalpswd;
	
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/button[1]")
	WebElement loginbutton;
	
	public Herballoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void myaccount()
	{
		myaccountclick.click();
	}
	public void mylogin()
	{
		loginclick.click();
	}
	public void setvalues(String email,String pswd)
	{
		herbalemail.sendKeys(email);
		herbalpswd.sendKeys(pswd);
	}
	public void login()
	{
		loginbutton.click();
	}

}
