package jan31pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class demo1 {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\LKM\\Cucumber\\Drivers\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
