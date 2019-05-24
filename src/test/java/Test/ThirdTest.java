package Test;

import org.testng.annotations.Test;

import Generic.BasePage;
import Pages.Homepage;
import Pages.Screenshotpage;
import Pages.Uploadpage;

public class ThirdTest extends BasePage{
	  @Test
	  public void thirdtest() throws InterruptedException {
		  test = report.startTest("My Third Test Case");
		  Homepage HP=new Homepage();
		  HP.gethomepage();
		Uploadpage UP=new Uploadpage();
		UP.fileupload();
		Screenshotpage SSP=new Screenshotpage();
		SSP.screenshot();
		  
		  report.endTest(test);
		  
	  }
}
