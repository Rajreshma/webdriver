package package1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodeofmultiplelink {
	ChromeDriver driver;
	
	
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void facebooklinkresponse()
	{
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("total no.of links="+linkdetails.size());
		
		for(WebElement element:linkdetails)
		{
			String link =element.getAttribute("href");
			verify(link);
		}
	
	}
	private void verify(String link) {
		try
		{
			URL u= new URL(link);
			HttpURLConnection con=(HttpURLConnection) u.openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("response code is 200   "  +link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("the response code is 404   "   +link);
			}
			else
			{
				System.out.println("other response code ");
			}
			
		}
		catch(Exception e)
		{
			
		}
	}

}
