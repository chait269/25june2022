package Com.Practice.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void browseropen()
	{
	    System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
	   driver.get("http://practice.automationtesting.in/");
	   
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void browserclose()
	{
//		driver.close();
		
	}
	

}
