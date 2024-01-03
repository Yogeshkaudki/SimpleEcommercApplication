package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
	
	@FindBy (xpath="//a[text()='COURSE']")
	private WebElement cousertab;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy (name="addresstype")
	private WebElement courseadd;
	
  
	public WebElement getCourseadd() {
		return courseadd;
	}

	public WebElement getCousertab() {
		return cousertab;
	}
	
	
	
	public SkillraryDemoLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	public void seleniumtraining() {
		seleniumtraining.click();
		
		
	}
	

}
