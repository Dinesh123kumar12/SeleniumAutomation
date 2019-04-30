package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginPage_PF;

public class TestExecutorExample {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\AutoMWithSelenum\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
	
		
		/*System.out.println("Login the FaceBook");
		driver.findElement(By.id("email")).sendKeys("Dineshkumar.janardanan@outlook.com");
		driver.findElement(By.id("pass")).sendKeys("Rama@123");
	
		WebElement login = driver.findElement(By.xpath("//input[@ value=\'Log In \']"));
		
		clickElementByJS(login ,driver);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);*/
		scorollPageDown(driver);
		
		WebElement help = driver.findElement(By.xpath("//*[@id=\"js_7\"]/ul/li[29]/a"));
		scorollIntoView(help, driver);
		
		
	}
	
	public static void clickElementByJS(WebElement element,WebDriver driver)
	{
		JavascriptExecutor JS =((JavascriptExecutor)driver);
		JS.executeScript("arguments[0].click();",element);
		
	}
	public static void scorollPageDown(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	public static void scorollIntoView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scorllIntoView(true);",element);

	}
	
}