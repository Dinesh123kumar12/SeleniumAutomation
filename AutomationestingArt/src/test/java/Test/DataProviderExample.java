package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelUtits;

public class DataProviderExample {

	WebDriver driver;
	/*@BeforeTest 
	 void Start ()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	
	}*/
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() throws Exception
	{
		/*return new Object[][]
				{ { "testuser", "lover@123"} ,{"testuser_2 ","Test@1432"}
				
				};*/
				
				
		ExcelUtits.SetExcelFile("C:\\Users\\elcot\\Desktop\\mydata.xlsx", "Dinesh");
		Object[][] obj= ExcelUtits.getExcelData();
		
		
		return obj;
	}

	
	@Test(dataProvider="Authentication")

	void LoginPage(String sUsername,String sPassword) throws Exception
	 {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("email")).sendKeys(sUsername);
		System.out.println("usename is inserted"+sUsername);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		driver.findElement(By.xpath("//input[@value='Log In]'")).click();
		driver.close();
		}
	
	


}
