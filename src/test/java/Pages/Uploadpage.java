package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;

public class Uploadpage extends Utility{
	
	@FindBy(xpath="//input[@id='imagesrc']")
	 WebElement upload;
	
	public Uploadpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void fileupload() throws InterruptedException
	{
		 upload(upload,"C:\\Users\\12581\\Desktop\\Driver\\Bikeinsurance_0.png");
		 Thread.sleep(5000);
	}


}
