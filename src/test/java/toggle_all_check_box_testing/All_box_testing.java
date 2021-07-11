package toggle_all_check_box_testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import pages.Toggle_all_check_box;
import util.PracticalExam;


public class All_box_testing {
	 WebDriver driver;
	 Toggle_all_check_box allBox ;
	
	 @Test
	public void all_box_tester() throws Throwable {
		
		driver =PracticalExam.launchBrowser();
		
		Thread.sleep(2000);
		 
	
		 allBox = PageFactory.initElements(driver, Toggle_all_check_box.class);
		 allBox.toggle_all();
		 allBox.toggle_all_verification();
		 allBox.takescreenshhot();
		 
		 driver =PracticalExam.closeBrowser();
	}
	
	
	

}
