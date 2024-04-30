package testnpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertrial {

	 WebDriver driver;
	@Parameters("browserName")
	
	@BeforeMethod
	public void setupMethod(String browserName)
	{
		if (browserName.equals ("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chrome files\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com");
			
		}
		else
			if(browserName.equals("firefox"))
		{
				System.setProperty("webdriver.edge.driver","C:\\Edge Files\\edgedriver_win64\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.get("https://www.saucedemo.com");
				
		}
			else
			{
				System.out.println("throw error");
			}
	}
	
	@Test
	public void executioncrossbrowser()
	
	{
		firstPage_Login np=new firstPage_Login(driver);
		np.sendusername();
		np.sendpassword();
		np.clickonbutton();
		np.closer();
		
		Crossbrowsertrial hp= new Crossbrowsertrial();
		hp.setupMethod("browser");
	}
	}


