package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	static WebDriver driver;
	@Test(groups = {"now"})
	public void Session1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Dinesh");
		System.out.println("Session 1 is pass");
		driver.close();
	}
	
	@Test(groups = {"now"})
	public void Session2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Kumar");
		System.out.println("Session 2 is pass");
		driver.close();
		
	}
	@Test(groups = {"now"})
	public void Session3()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Ravi");
		System.out.println("Session 3 is pass");
		driver.close();	
		
	}
	@Test(groups = {"Then"})
	public void Session4()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Ram");
		
		System.out.println("Session 4 is pass");
		driver.close();
	}

	@Test(groups = {"now"})
public void Session5()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Raj");
		System.out.println("Session 5 is pass");
		driver.close();
	}
}

