package Generic;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.AfterSuite;

public class BasePage {
 
	public static ExtentTest test;

	public static ExtentReports report;
	
	public static WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-extensions");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
				UnexpectedAlertBehaviour.IGNORE);
		driver = new ChromeDriver(options);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

  @BeforeSuite
  public void beforeSuite() {
	  
		report = new ExtentReports(".\\ExtentReport.html");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  report.flush();
  }

}
