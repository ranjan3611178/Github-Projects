package Githubgroup.Githubartifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Git_demo1 {
	 WebDriver driver;
	
	  @Test
	  public void verifytitle() {
		  driver.get("https://www.facebook.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Facebook – log in or sign up"));
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("--------*****open chrome browser******--------");
		  String Path="F:\\SELENIUM\\Driver\\geckodriver-v0.23.0-win64\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", Path);
			driver=new FirefoxDriver();  
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("close browser");
		  driver.quit();
	  }

	

}
