package package1;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Responsecode {
	String link="https://www.facebook.com";
	
	@Test
	public void test()
	{
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code =con.getResponseCode();
			System.out.println(code);
			
			if(code==200)
			{
				System.out.println("response code is 200");
				
			}
			else
			{
				System.out.println("is not 200");
			}
			
		}
		catch(Exception e)
		{
			
		}
	
	
	}
	

}
