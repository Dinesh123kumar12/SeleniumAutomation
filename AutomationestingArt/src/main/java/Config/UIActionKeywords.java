	package Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIActionKeywords {
	

	public static  WebDriver driver;
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void navigate()
	{
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
	}
	public static void enterEmail()
	{
		driver.findElement(By.id("email")).sendKeys("Dineshkumar.janardanan@outlook.com");
		
		
	}
	public static void enterPassswsord()
	{
		driver.findElement(By.id("pass")).sendKeys("Rama@123");
		
	}
	public static void clickLogin()
	{
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}
	public static void applyWait() throws Exception
	{
		Thread.sleep(2000);
		
	}
	public static void closeBowser()
	{
		driver.quit();
	}
	
	
	
	
	}
	
	
	


