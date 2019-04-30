package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogintoMMT {
	
	//static WebDriver driver;
	@BeforeMethod
	public void StartBrowser()
	
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.MakeMyTrip.com");
		driver.manage().window().maximize();
		*/
		Reporter.log("========Browser Sessionn Started====",true);
		System.out.println("Lanch Broeser");
		
	}
	@Test(priority=0,description="This test case is for LogIn")
	public void LoninToFlipkart()
	{
		System.out.println("Logged In to MMN");
	}
	@AfterMethod
	public void CloseBrowser()
	{
		System.out.println("Closing Browser");
		Reporter.log("========Browser Sessionn Started====",true);
		
	}



}
