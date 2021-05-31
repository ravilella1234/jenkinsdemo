package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> str) 
  {
	  if(str.get("RunMode").equals("Y"))
	  {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 20201 Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("email")).sendKeys(str.get("UserName"));
			driver.findElement(By.id("pass")).sendKeys(str.get("Pasword"));
	  }
	    
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitea.xlsx");
		String sheetName = "Data";
		String testCaseName = "LoginTest";
		
		return DataUtils.getTestData(e, sheetName, testCaseName);
  }
  
}
