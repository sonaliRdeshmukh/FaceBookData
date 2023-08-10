package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
  protected WebDriver driver;

 public void openFacebook()
 {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
 }
 public void closeBrowser()
 {
	 driver.quit();
 }
}