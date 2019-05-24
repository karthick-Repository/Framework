package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Generic.BasePage;

public class Utility extends BasePage{
	
	public static void openurl(String url)
	{
		try
		{
			driver.get(url);
			test.log(LogStatus.PASS, "Successfully Url Launched");
			
		}
		catch(Exception e)
		{
			e.getMessage();
			test.log(LogStatus.FAIL, "Successfully Url Launched");
		}
	}
	
	
	public static void upload(WebElement xpath,String uploadpath)
	{
		try
		{
			System.out.println(uploadpath);
			xpath.sendKeys(uploadpath);
			test.log(LogStatus.PASS, "Successfully File Uploaded");
			
		}
		catch(Exception e)
		{
			e.getMessage();
			test.log(LogStatus.FAIL, "File Not Uploaded");
		}
	}

	
	public static void screenshot(String screenshotpath)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(screenshotpath));
			test.log(LogStatus.PASS, "Successfully Screenshot taken");
			
		}
		catch(Exception e)
		{
			e.getMessage();
			test.log(LogStatus.FAIL, "Screenshot not taken");
		}
	}

}
