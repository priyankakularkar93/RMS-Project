package testnpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_functionality {

	WebDriver driver;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement logout;
	
	public void clickonlogout()
	{
		logout.click();
		
	}
	
	public Logout_functionality (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
