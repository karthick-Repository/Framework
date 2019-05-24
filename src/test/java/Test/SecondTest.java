package Test;

import org.testng.annotations.Test;

import Generic.BasePage;
import Pages.Homepage;
import Pages.Uploadpage;

public class SecondTest extends BasePage{
	 @Test
	  public void secondtest() throws InterruptedException {
		  test = report.startTest("My Second Test Case");
		  Homepage HP=new Homepage();
		  HP.gethomepage();
		Uploadpage UP=new Uploadpage();
		UP.fileupload();
		  report.endTest(test);
		  
	  }
}
