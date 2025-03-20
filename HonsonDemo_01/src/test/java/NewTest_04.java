import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest_04 {
	WebDriver driver;
  @Test
  public void f() { //Booking ticktes 
	  System.out.println("Navigating AccenSports page");
	  driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/");
	  System.out.println("Click on the Booktickets field");
	  driver.findElement(By.xpath("//a[@name='booktickets']")).click();
	  Actions act = new Actions(driver);
	  System.out.println("Click on the Buytickets field button");
	  driver.findElement(By.xpath("//button[@class='button']")).click();
	  act.pause(2000).build().perform();
	  System.out.println("Click on Name And Enter the name");
	  driver.findElement(By.xpath("//input[@placeholder='name']")).sendKeys("Vinaykumar");
	  act.pause(2000).build().perform();
	  System.out.println("Click on next button");
	  driver.findElement(By.xpath("//button[@id='next1']")).click();
	  act.pause(2000).build().perform();
	  System.out.println("Click on the phone field");
	  driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys("6281075728");
	  act.pause(2000).build().perform();
	  System.out.println("Click on the next");
	  driver.findElement(By.xpath("//button[@id='next2']")).click();
	  System.out.println("Click on the email field");
	  driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("vinaykumar.vinay@accenture.com");
	  act.pause(2000).build().perform();
	  System.out.println("Click on the next");
	  driver.findElement(By.xpath("//button[@id='next3']")).click();
	  act.pause(1000).build().perform();
	  System.out.println("Click on the submit");
	  driver.findElement(By.xpath("//span[@class='mat-mdc-select-placeholder mat-mdc-select-min-line ng-tns-c94-5 ng-star-inserted']")).click();
	  act.pause(1000).build().perform();
	  
	  Actions select = new Actions(driver);
	  act.pause(1000).build().perform();
	  select.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
	  
	  driver.findElement(By.xpath("//button[text()='Submit']")).click();
	  act.pause(1000).build().perform(); 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new EdgeDriver();
	  driver.manage().window().maximize();
	  
  }
  @AfterTest
  public void afterTest() {
  }

}
