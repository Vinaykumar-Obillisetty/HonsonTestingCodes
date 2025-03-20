import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest_09 {
	WebDriver driver;
  @Test
  public void playerandteamstrategy(){
	  System.out.println("Navigating the AccenSports");
	  driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/");
	  System.out.println("Click on the player & team Strategy field");
	  driver.findElement(By.xpath("//a[@class='playerandteamstrategy']")).click();
	  Actions act = new Actions(driver);
	  System.out.println("Click poll and Stratgery field");
	  
	  WebElement ele = driver.findElement(By.xpath("//body/app-root/app-main/app-playerandteamstrategy/div[@class='container']/div[@class='row']/ul[@id='menu3']/li[1]/a[1] "));
	  Actions action = new Actions(driver);
	  action.moveToElement(ele).perform();
	  act.pause(2000).build().perform();
	  System.out.println("click on the Stats & Analysis");
	  driver.findElement(By.linkText("Stats & Analysis")).click();
	  
	  driver.findElement(By.xpath("//canvas[@id='graph']"));
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
