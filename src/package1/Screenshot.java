package package1;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/rajre/OneDrive/Desktop/.html");
	}
	@Test
	public void screenshot() throws Exception
	{
		
		//to take screenshot of the whole page
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("C:\\Users\\rajre\\OneDrive\\Pictures\\screenshot.png"));
		
		//to take screenshot of  a singlr button
		WebElement button=driver.findElement(By.xpath("//input[@type='button']"));
		File s2=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s2, new File("./Screenshot/displaybutton.png"));
	
	}

}
