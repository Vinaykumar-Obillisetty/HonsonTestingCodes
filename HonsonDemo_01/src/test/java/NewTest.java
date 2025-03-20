import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void playerRegistration() {
	  driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/webelemens/form");
		 Actions act = new Actions(driver);
		 driver.findElement(By.id("firstname")).sendKeys("vinaykumar");
		 act.pause(2000). build().perform();
		 driver.findElement(By.id("mat-input-1")).sendKeys("Obillisetty");
		 act.pause(2000). build().perform();
		 driver.findElement(By.id("Date")).sendKeys("3/12/2025");
		 act.pause(2000). build().perform();
		 driver.findElement(By.id("phonenumber")).sendKeys("6281075728");
		 act.pause(2000). build().perform();
		 driver.findElement(By.id("mat-input-4")).sendKeys("vinaykumarviny45@gmail.com");
		 act.pause(2000). build().perform();
		 driver.findElement(By.id("mat-radio-2-input")).click();
		 act.pause(2000). build().perform();
		 Actions age = new Actions(driver);
		 
		 age.moveToElement(driver.findElement(By.name("selectage"))).click().keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyDown(Keys.ENTER ).build().perform();
		 act.pause(2000).build().perform();
		
	     WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));
	     act.pause(2000).build().perform();
	     Actions slide = new Actions(driver);
	     slide.dragAndDropBy(slider, 60,0).build().perform();
	     driver.findElement(By.cssSelector("mat-select[id='multisport']")).click();//
	     Actions sports = new Actions(driver);           
	     sports
	     .keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER)
		  .keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER)
		  .keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER)
		  .keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER)
		  .keyDown(Keys.TAB).build().perform();
	     
	     driver.findElement(By.cssSelector("input[type='file'] ")).sendKeys("C:\\Users\\vinaykumar.vinay\\Documents\\Certifications\\Agile Ceritification ");
	     act.pause(2000).build().perform();
	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Nellore,Andhra pradesh");
	     act.pause(2000).build().perform();
	     driver.findElement(By.cssSelector("input[type = 'number'][id='mat-input-6']")).sendKeys("524005");
	     act.pause(2000).build().perform();
	     driver.findElement(By.xpath("//*[@id=\"mat-mdc-checkbox-1-input\"] ")).click();
	     act.pause(2000).build().perform();
	     driver.findElement(By.name("submitbutton")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
