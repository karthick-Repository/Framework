package Pages;

import org.openqa.selenium.support.PageFactory;

import Utility.Utility;

public class Homepage extends Utility{

	public Homepage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void gethomepage() throws InterruptedException
	{
		 openurl("http://demo.automationtesting.in/Register.html");
		 Thread.sleep(5000);
	}
}
