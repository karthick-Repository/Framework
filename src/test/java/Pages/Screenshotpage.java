package Pages;

import org.openqa.selenium.support.PageFactory;

import Utility.Utility;

public class Screenshotpage extends Utility{
	
	public Screenshotpage() {
		PageFactory.initElements(driver,this);
		
	}

	public void screenshot() throws InterruptedException
	{
		 screenshot("C:\\Users\\12581\\Desktop\\BroadbandBill\\Acte.png");
		  Thread.sleep(5000);
	}
}
