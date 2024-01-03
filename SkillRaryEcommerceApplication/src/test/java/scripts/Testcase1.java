package scripts;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	@Test
	
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.switchTabs(driver);
		driverutilies.mouseHover(sd.getCousertab(), driver);
		sd.seleniumtraining();
		
		AddtocartPage ad=new AddtocartPage(driver);
		driverutilies.doubleClick(driver, ad.getAddbtn());
		driverutilies.alertpopup(driver);
	}

}
