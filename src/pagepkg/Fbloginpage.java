package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
	
	By fbemail=By.id("email");
	By fbpswd=By.xpath("//*[@id=\"pass\"]");
	By fbloginbutton=By.name("login"); 
	
	//these 3 are object repository to store all webstore elements
	
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;       ////create constructor to store instance variable
	}
	
	
public void setvalues(String email,String pswd)     ///store values in testpkg
{
	
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpswd).sendKeys(pswd);
	
}
public void fblogin()
{
	driver.findElement(fbloginbutton).click();
}

}