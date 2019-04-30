package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage_PF;
import PageObjects.LoginPage_PF;

public class VailedLogInLogOut {
	
	private static final WebElement Recover = null;
	static WebDriver driver;
	@BeforeTest 
	public void StartBrowser ()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");


	}
	@Test
	public void LoginPage() throws Exception
	
	{
		
		LoginPage_PF loginPage=PageFactory.initElements(driver, LoginPage_PF.class);
		
		loginPage.txtbx_UserName.sendKeys("Dineshkumar.janardanan@outlook.com");
		loginPage.txtbx_Password.sendKeys("Rama@123");
		loginPage.btn_LogIn.click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		//r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	
	
		
		
		System.out.println("Log in successfully, now oit is  the time to Log Off");
	}
	
	@Test
	public void Logout()
	
	{
		HomePage_PF homepage=PageFactory.initElements(driver,HomePage_PF.class);
		
		
		homepage.lnk_AccountSetting.click();
		homepage.lnk_LogOut.click();
		
		
		System.out.println("Log OuT SuccessfullY");
	}
	
	
}
