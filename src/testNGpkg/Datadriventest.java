package testNGpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {

	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void datadriven() throws IOException
	{
		driver.get("https://www.facebook.com/");
		
		FileInputStream f=new FileInputStream("C:\\Users\\rajre\\OneDrive\\Desktop\\Book3.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet s=wb.getSheet("sheet1");
		int rowcounts=s.getLastRowNum();
	    System.out.println(rowcounts);
		for(int i=1;i<=rowcounts;i++)
		{
			String username=s.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswd=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pswd="+pswd);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
		}
	}
}
