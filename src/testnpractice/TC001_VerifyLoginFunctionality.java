package testnpractice;

import org.testng.annotations.Test;

public class TC001_VerifyLoginFunctionality extends Test_Base_Class

{
@Test
public void login_function()
{
	String actualResult= "driver.getTitle()";
	String expectedResult="Swag Labs";
	
	if (expectedResult.equals(actualResult))
	{
		System.out.println("TC is passed");
	}
	else
	{
		System.out.println("TC is failed");
	}
}



}
