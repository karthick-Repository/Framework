package Test;

import org.testng.annotations.Test;

import Generic.BasePage;
import Pages.Homepage;

public class FirstTest extends BasePage{
 
  @Test
  public void firsttest() throws InterruptedException {
	  test = report.startTest("My First Test Case");
	  Homepage HP=new Homepage();
	  HP.gethomepage();
	  report.endTest(test);
	  
  }
}
