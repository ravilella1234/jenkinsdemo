package grid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo 
{
	
  @Test
  public void test1() throws Exception 
  {
	  System.out.println("Started Test1");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.ANY);
	  ds.setBrowserName("firefox");
	  
	 WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ds);
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 System.out.println("Title is : " + driver.getTitle());
	 
	 Thread.sleep(7000);
	 driver.quit();
	 System.out.println("Ended Test1");
	 
  }
  
  @Test
  public void test2() throws Exception 
  {
	  System.out.println("Started Test2");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.ANY);
	  ds.setBrowserName("firefox");
	  
	 WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ds);
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 System.out.println("Title is : " + driver.getTitle());
	 
	 Thread.sleep(7000);
	 driver.quit();
	 System.out.println("Ended Test2");
	 
  }
  
  @Test
  public void test3() throws Exception 
  {
	  System.out.println("Started Test3");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.ANY);
	  ds.setBrowserName("firefox");
	  
	 WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ds);
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 System.out.println("Title is : " + driver.getTitle());
	 
	 Thread.sleep(7000);
	 driver.quit();
	 System.out.println("Ended Test3");
	 
  }
  
  @Test
  public void test4() throws Exception 
  {
	  System.out.println("Started Test4");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.ANY);
	  ds.setBrowserName("firefox");
	  
	 WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ds);
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 System.out.println("Title is : " + driver.getTitle());
	 
	 Thread.sleep(7000);
	 driver.quit();
	 System.out.println("Ended Test4");
	 
  }
  
  @Test
  public void test5() throws Exception 
  {
	  System.out.println("Started Test5");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.ANY);
	  ds.setBrowserName("firefox");
	  
	 WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ds);
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 System.out.println("Title is : " + driver.getTitle());
	 
	 Thread.sleep(7000);
	 driver.quit();
	 System.out.println("Ended Test5");
	 
  }
  
  @Test
  public void test6() throws Exception 
  {
	  System.out.println("Started Test6");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.ANY);
	  ds.setBrowserName("firefox");
	  
	 WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ds);
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 System.out.println("Title is : " + driver.getTitle());
	 
	 Thread.sleep(7000);
	 driver.quit();
	 System.out.println("Ended Test6");
	 
  }
  
  @Test
  public void test7() throws Exception 
  {
	  System.out.println("Started Test7");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\geckodriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.ANY);
	  ds.setBrowserName("firefox");
	  
	 WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ds);
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 System.out.println("Title is : " + driver.getTitle());
	 
	 Thread.sleep(7000);
	 driver.quit();
	 System.out.println("Ended Test7");
	 
  }
  
}
