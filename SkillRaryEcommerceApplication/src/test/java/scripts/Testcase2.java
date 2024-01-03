package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;

import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	@Test
	
	public void tc2() throws IOException {
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
	   	s.skillraryDemoapp();
		
		       SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
				driverutilies.switchTabs(driver);
		        driverutilies.dropdown(sd.getCousertab(),pdata.getData("courseadd"));
		
		 TestingPage tp = new TestingPage(driver);
		driverutilies.dragandDrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
		  WebElement l = tp.getFacebook();
	Point lp = l. getLocation();
		 
		
		int x = lp.getX();
		int y = lp.getY();
		
		driverutilies.scrollBar(driver, x, y);
		tp.facebook();
	}

}
