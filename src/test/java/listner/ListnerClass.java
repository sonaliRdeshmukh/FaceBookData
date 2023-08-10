package listner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerClass implements ITestListener 
{
	@Override
		public void onTestStart(ITestResult result)
	{
		 String tcName=result.getName();
		   Reporter.log("This" +tcName +"method start sucessfully ", true);
	   }
   @Override
public void onTestSuccess(ITestResult result) 
   {
	   String tcName=result.getName();
	   Reporter.log("This" +tcName +"method completly successfull ", true);
   }
   @Override
public void onTestFailure(ITestResult result) 
   {
	   String tcName=result.getName();
	   Reporter.log("This" +tcName +"method is Fail ", true);
   }
   @Override
public void onTestSkipped(ITestResult result) 
   
   {
	   String tcName=result.getName();
	   Reporter.log("This" +tcName +"method is skipped ", true);
   }
}
