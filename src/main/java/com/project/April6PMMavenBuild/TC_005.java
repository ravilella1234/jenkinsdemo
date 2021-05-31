package com.project.April6PMMavenBuild;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.startTest("TC_005");
		test.log(LogStatus.INFO, "Init the Properties files....");
				
		openBrowser("chromebrowser");
		test.log(LogStatus.INFO, "Opened the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Opened the Url : " + childProp.getProperty("amazonurl"));
		
		windowMaximize();
		test.log(LogStatus.INFO, "Maximized the window....");
		
		selectOption("amazondropdown_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books by using Locator :- " + orProp.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(LogStatus.INFO, "Entered the test HarryPotter By using the locator :-" + orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on amazon search button By using locatoer :- "+ orProp.getProperty("amazonsearchbutton_xpath"));	
		
		report.endTest(test);
		report.flush();
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}
}
