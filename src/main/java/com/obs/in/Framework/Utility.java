package com.obs.in.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utility {

	public void LaunchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		WebDriver Browser= new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		options.addArguments("--start-maximized--");
		
		Browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		Browser.get("http://www.Google.com");        
		
		String url= Browser.getCurrentUrl();
		Browser.getCurrentUrl();
		System.out.println(url);
	}
}
