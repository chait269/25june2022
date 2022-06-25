package Com.Practice.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Practice.POM.HomePage;

public class TC001validatingHomePageSlider extends BaseTestClass
{
	@Test
	public void slidersofhomepage() throws InterruptedException
	{
		 HomePage h=new  HomePage(driver);
		 
		 h.clickshopbutton();
		 h.clickhomebutton();
		 Thread.sleep(2000);
		 h.Clickarrow();
		 Thread.sleep(2000);
		 h.Clickarrow();
//		 String Actual=h.GetArrowText();
//		 String Expected="JavaScript";
//		 Assert.assertEquals(Actual, Expected);
				
		 
		 
	}

}
