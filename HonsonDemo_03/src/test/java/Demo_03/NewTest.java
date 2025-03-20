package Demo_03;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void SportsMerchandise(){
	  System.out.println("Navigatoing to AccentSports Portal url");
	  driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/");
	  Actions act= new Actions(driver);
	  System.out.println("Click on the Sports Merchandise Field");
	  driver.findElement(By.xpath("//a[text()='Sports Merchandise' ]")).click();
	  act.pause(2000). build().perform();
	  System.out.println("click on the iteam card");
	  driver.findElement(By.xpath("//div[@class='thecard'] ")).click();
	  act.pause(2000). build().perform();
	  System.out.println("click on the price Button");
	  driver.findElement(By.id("button1")).click();
	  act.pause(2000). build().perform();
	  System.out.println("Click on the Name filed");
	  driver.findElement(By.id("name")).sendKeys("Vinaykumar");
	  act.pause(2000). build().perform();
	  System.out.println("Click on the next Button ");
	  driver.findElement(By.xpath("//button[text()='Next']")).click();
	  act.pause(2000). build().perform();
	  System.out.println("Click on phone num field And Enter phone number");
	  driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys("6281075728");
	  act.pause(2000). build().perform();
	  System.out.println("click on next Button");
	  driver.findElement(By.id("next2")).click();
	  act.pause(2000). build().perform();
	  System.out.println("Click on the Email filed");
	  driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("vinaykumarviny45@gmail.com");
	  act.pause(2000). build().perform();
	  System.out.println("Click on next Button");
	  driver.findElement(By.id("next3")).click();
	  act.pause(2000). build().perform();
	  System.out.println("Click on the Address and Enter the Customer Addredss" );
	  driver.findElement(By.xpath("//input[@formcontrolname='address']")).sendKeys("Nellore");
	  act.pause(2000). build().perform();
	  System.out.println("Click on the Next Submit Button");
	  driver.findElement(By.xpath("//button[text()='Submit']")).click();
	  act.pause(2000). build().perform();
	  System.out.println("Click on CreditCard Holder Name field And Enter Holder");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vinaykumar obillisetty");
	  act.pause(2000). build().perform();
	  System.out.println("Click on Credit card number");
	  driver.findElement(By.id("cardnumbercredit")).sendKeys("1345 5678 2345 7654");
	  act.pause(2000). build().perform();
	  System.out.println("Click on Expiry Month field");
	  driver.findElement(By.xpath("//select[@name='months']")).click();
	  System.out.println("Select Expiry month");
	  driver.findElement(By.xpath("// option[@value='January']")).click();
	  act.pause(2000). build().perform();
	  System.out.println("Click on the Expiry year field");
	  driver.findElement(By.name("expyear")).sendKeys("2027");
	  act.pause(2000). build().perform();
	  System.out.println("Click on the cvv field");
	  driver.findElement(By.id("cvv")).sendKeys("345");
	  act.pause(2000). build().perform();
	  System.out.println("Click on Submit Button");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  act.pause(3000).build().perform();
	  System.out.println("Click on ok Button");
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	  
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
