package testnpractice;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TC002_verifyaddtocart extends Test_Base_Class 
{

	@Test
	public void addtocart() 
	{
		Addtocartelement yu=new Addtocartelement(driver);
		yu.addtocart();
		
		System.out.println("Single product added");
		
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
