package Demo_03;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class SportsTermandStrategy {
	WebDriver driver; 
	@Test
  public void PlayerTeam(){
	  driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/");
	  Actions act=new Actions(driver);
	  driver.findElement(By.xpath("//a [@class='playerandteamstrategy']")).click();
	  System.out.println("");
	  driver.findElement(By.xpath("//span[@id='analysis']"));	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new EdgeDriver();
	  driver.manage().window().maximize();
  }
  
}
