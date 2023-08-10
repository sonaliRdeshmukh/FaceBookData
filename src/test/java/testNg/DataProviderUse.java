package testNg;

import org.testng.annotations.DataProvider;

public class DataProviderUse 

{
	@DataProvider(name="FbData")
   public static String[] testFbEmail()
   {
	 String data[]= {"sd3342875@gmail.com"};
	 return data;
   }
	@DataProvider(name="FbData1")
	   public static String[] testFblogin()
	   {
		 String Data1[]= {"Sonali@1223"};
		 return Data1;
	   }
	
	
}
