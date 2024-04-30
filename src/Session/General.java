package Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class General {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Edge Files\\edgedriver_win64\\msedgedriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver = new EdgeDriver();
		// Maximize the browser
		Thread.sleep(5000);
		driver.manage().window().maximize();
		// Launch Website
		driver.get("https://www.saucedemo.com");
	}

}
