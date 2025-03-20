package Demo_03;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class SportsCoaching {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElements(By.xpath("https://lkmdemoaut.accenture.com/AccenSportz/#/"));
	  driver.findElements(By.xpath("//a[@name='booktickets']"));
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
