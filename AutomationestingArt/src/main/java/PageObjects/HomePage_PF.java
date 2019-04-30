package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage_PF {
	@FindBy(how = How.XPATH,using ="//*[@id=\"facebook\"]/body")
	public WebElement lnk_setting;
	
	@FindBy(how = How.XPATH,using ="//div[@id='userNavigationLabel']\"")
	public WebElement lnk_AccountSetting;
	

	@FindBy(how = How.XPATH,using ="//*[@id=\"facebook\"]/body']\"")
	public WebElement lnk_LogOut;
	
	
	



}
