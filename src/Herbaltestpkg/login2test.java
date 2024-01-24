package Herbaltestpkg;

import org.testng.annotations.Test;

import Herbalpagepkg.Herbalhealth;
import Herbalpagepkg.Herballoginpage;

public class login2test extends Base2class {
	@Test
	public void healthpage()
	{
		Herballoginpage hd=new Herballoginpage(driver);
		hd.myaccount();
		hd.mylogin();
		
		hd.setvalues("rajreshma023@gmail.com", "Reshma@023");
        hd.login();		
	}

}
