package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  @FindBy(xpath = "//input[@id='email']")private WebElement emailIdFeild;
  @FindBy(xpath = "//input[@name='pass']")private WebElement passwordFeild;
  
  public LoginPage(WebDriver driver)
 {
	  PageFactory.initElements(driver, this);
  }
  
  public void  enterEmailFeild(String email)
  {
	 emailIdFeild.sendKeys(email); 
  }
  
  public void enterPasswordFeild(String password)
  {
	  passwordFeild.sendKeys(password);
  }
}
