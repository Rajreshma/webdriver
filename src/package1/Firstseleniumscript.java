package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();   //to launch browser
		driver.get("https://www.instagram.com");
		
		
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		driver.quit();
		
		String title ="insta";
		System.out.println(actualtitle.equalsIgnoreCase(title));
		
		if(actualtitle.equalsIgnoreCase(title))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		

	}

}
