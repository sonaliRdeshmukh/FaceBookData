package base;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SimpleClass 
{
    @Test
    public void simple()
    {
    	Reporter.log("This is simple class", true);
    }
}
