package testnpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Addtocartelement {

	WebDriver driver;
	
	@FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement fisrtadd;
	
	public void addtocart()
	{
		fisrtadd.click();
	}
	
	public Addtocartelement(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
