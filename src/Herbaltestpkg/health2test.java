package Herbaltestpkg;

import org.testng.annotations.Test;

import Herbalpagepkg.Herbalhealth;



public class health2test extends Base2class {
	@Test
	public void logintestcheck()
	{
		Herbalhealth ob2=new Herbalhealth(driver);
		ob2.health();
		ob2.droplist();
		ob2.sendbutton();
		ob2.setvalues();
		
		ob2.snd();
	}

}
