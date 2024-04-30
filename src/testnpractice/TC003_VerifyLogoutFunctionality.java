package testnpractice;

import org.testng.annotations.Test;

public class TC003_VerifyLogoutFunctionality extends Test_Base_Class 
{

	@Test
	public void logoutfunctionality()
	{
		Logout_functionality gy=new Logout_functionality(driver);
				
		gy.clickonlogout();
		System.out.println("Logout Done");
		
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
