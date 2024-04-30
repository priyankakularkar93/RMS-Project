package testnpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test_Base_Class {
	WebDriver driver;

	@BeforeMethod
	public void setUpMethod() throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Edge Files\\edgedriver_win64\\msedgedriver.exe");
		 driver=new EdgeDriver();
		 System.out.println("browser is open");
		Thread.sleep(5000);
		driver.get("https://www.saucedemo.com");
		System.out.println("URL entered");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		firstPage_Login np=new firstPage_Login(driver);
		np.sendusername();
		System.out.println("username is enter");
		np.sendpassword();
		System.out.println("passowrd is enter");
		np.clickonbutton();
		System.out.println("click on clickbutton");
		
	}
	
	//@AfterMethod
	public void teardownMethod()
	{
		driver.close();
		System.out.println("driver closed");
	}

}
