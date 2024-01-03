package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass{
	
	@Test
	public void tc1() throws IOException, InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.serachTextbox(pdata.getData("coursedata"));
		
		s.gobutton();
		CorejavaPage c = new CorejavaPage(driver);
		
		c.seleniumtraining();
		
	WishlistPage w = new WishlistPage(driver);
	w.btn();
	driverutilies.switchFrame(driver);
	Thread.sleep(50000);
	w.playbutton();
	Thread.sleep(100000);
	w.pausebutton();
	driverutilies.switchFrame(driver);
		
	}

}
