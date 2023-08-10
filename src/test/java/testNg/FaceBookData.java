package testNg;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.LoginPage;
import utility.UtilityClassStudy;

public class FaceBookData extends BaseClass
{
	LoginPage login;
	
	@BeforeClass
	public void lunchFb()
	{
		openFacebook();
		login=new LoginPage(driver);
		
	}

	
  @Test(priority = -1,dataProvider = "FbData",dataProviderClass =testNg.DataProviderUse.class)
  public void validateEmailId(String email) throws IOException 
  {
	  UtilityClassStudy.implicitWait(driver, 2000);
	  login.enterEmailFeild((email));
	  
  }
  @Test(dataProvider = "FbData",dataProviderClass =testNg.DataProviderUse.class)

	public void validatePassword(String password) throws IOException
	{
		UtilityClassStudy.implicitWait(driver, 3000);
		login.enterPasswordFeild((password));
	}
	
	@AfterClass
	public void closebrowser()
	{
		UtilityClassStudy.implicitWait(driver, 3000);
		driver.quit();
	}
}
