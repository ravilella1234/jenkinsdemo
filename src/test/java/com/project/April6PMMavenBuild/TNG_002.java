package com.project.April6PMMavenBuild;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	  	init();
		test = report.startTest("TC_005");
		test.log(LogStatus.INFO, "Init the Properties files....");
				
		openBrowser(bType);
		test.log(LogStatus.INFO, "Opened the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Opened the Url : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	    windowMaximize();
		test.log(LogStatus.INFO, "Maximized the window....");
		
		selectOption("amazondropdown_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books by using Locator :- " + orProp.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(LogStatus.INFO, "Entered the test HarryPotter By using the locator :-" + orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on amazon search button By using locatoer :- "+ orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess()
  {
	  driver.quit();
	  
	  report.endTest(test);
	  report.flush();
  }

}
