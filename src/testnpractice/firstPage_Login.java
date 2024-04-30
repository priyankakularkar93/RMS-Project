package testnpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class firstPage_Login {
	
	WebDriver driver;

	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	public void sendusername()
	{
		username.sendKeys("problem_user");
	}
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement passwordset;
	public void sendpassword()
	{
		passwordset.sendKeys("secret_sauce");
	}
	
@FindBy(xpath="//input[@id='login-button']")
private WebElement clickbutton;
public void clickonbutton()
{
	clickbutton.click();
	
}

@AfterTest

public void closer()
{
	driver.close();
	}
	
public firstPage_Login (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}
