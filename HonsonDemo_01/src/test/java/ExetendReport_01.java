import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExetendReport_01 {
		  @Test (priority=0, groups="sanity")
		  public void testPredictionTime() {
			  System.out.println("Inside testPredictionTime method");
		  }
		  @Test (priority=1, groups="sanity")
		  public void testPlayerSelection() {
			  System.out.println("Inside testPlayerSelection method");
		  }
		  @Test (priority=2, groups="sanity")
		  public void testSportsMerchandise() {
			  System.out.println("Inside testSportsMerchandise method");
		  }
		  @Test (priority=3, groups="sanity")
		  public void testFantasySports() {
			  System.out.println("Inside testFantasySports method");
		  }
		  @Test
		  public void extentrep() {
			  ExtentReports extentrpt = new ExtentReports();
			  ExtentSparkReporter sparkrpt = new ExtentSparkReporter("./Extent_Report.html");
			  extentrpt.attachReporter(sparkrpt);
			  extentrpt.createTest("testPredictionTime").log(Status.PASS, "Test Passed");
			  extentrpt.createTest("testPlayerSelection").log(Status.FAIL, "Test Failed");
			  extentrpt.createTest("testSportsMerchandise").log(Status.INFO, "Test Info");
			  extentrpt.createTest("testFantasySports").log(Status.SKIP, "Test Skippedrpt");
			  extentrpt.flush();
					  
		  }
  }

