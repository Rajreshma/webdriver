package testNGpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrisation {
	
	
	@Parameters({"s"})
	@Test
	public void main(String s)
	{
		System.out.println("value="+s);
	}

}
