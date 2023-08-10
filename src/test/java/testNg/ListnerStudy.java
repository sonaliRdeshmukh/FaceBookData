package testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listner.ListnerClass.class)
public class ListnerStudy {
  @Test
  public void Test1() 
  {
	  Reporter.log("Test 1 is running", true);
  }
  @Test
  public void Test2() 
  {
	  Reporter.log("Test 2 is running", true);
  }
  @Test
  public void Test3() 
  {
	  Assert.fail();
	  Reporter.log("Test 3 is running", true);
  }
  @Test
  public void Test4() 
  {
	  Reporter.log("Test 4 is running", true);
  }
  @Test(dependsOnMethods = "Test3")
  public void Test5() 
  {
	  Reporter.log("Test 5 is running", true);
  }
}
