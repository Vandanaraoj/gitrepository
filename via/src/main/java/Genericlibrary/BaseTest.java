package Genericlibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public static WebDriver driver;
	
	@BeforeClass
	public void Browser_setup() throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@AfterClass(alwaysRun=true)
	public void Browser_tear_down() {
		Reporter.log("close",true);
		driver.quit();
		
	}
}
