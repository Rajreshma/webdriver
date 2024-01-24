package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadautoit {
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();

	}
	@Test
	public void fileuploadpgm() throws Exception   
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\rajre\\OneDrive\\autoit\\T3.exe");
		//Thread.sleep(3000);
	}
}