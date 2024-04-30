package testnpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class loginfunctionality
{

	
		
	@Test
		public void checkpoint() throws InterruptedException
		{
			System.setProperty("webdriver.edge.driver", "C:\\Edge Files\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			Thread.sleep(5000);
			driver.get("https://www.saucedemo.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			firstPage_Login np=new firstPage_Login(driver);
			np.sendusername();
			np.sendpassword();
			np.clickonbutton();
			np.closer();
			
			
		}
		
	}


