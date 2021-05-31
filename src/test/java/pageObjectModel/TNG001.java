package pageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.April6PMMavenBuild.BaseTest;

public class TNG001 extends BaseTest
{
		
   @BeforeMethod
   public void beforeMethod() 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 20201 Drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://automationpractice.com/index.php");
	   driver.manage().window().maximize();
	   //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }	
	
   @Test(enabled = false)
   public void f() throws Exception 
   {
 	  LoginPage login = new LoginPage(driver);
 	  login.customerLogin();
 	  Assert.assertEquals(login.verifyLogin(), "Authentication failed.");
   }
   
   @Test
   public void custRegistration() throws Exception
   {
	   CustomerRegistration cr = new CustomerRegistration(driver);
	   cr.customerRegistration();
   }
  

   @AfterMethod
   public void afterMethod() 
   {
	  
   }

}
