package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 20201 Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		 driver.manage().window().maximize();
		   
		 driver.switchTo().frame(0);
		 driver.findElement(By.linkText("org.openqa.selenium")).click();
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		 driver.findElement(By.linkText("WebDriver")).click();
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		 driver.findElement(By.linkText("ChromeDriver")).click();

	}
}
