package Session;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Find_Element {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("FIRST COMMITE BY PRIYANKA=======");
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.saucedemo.com");
		
		WebElement user= driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys("standard_user");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");
		
		WebElement login=driver.findElement(By.xpath("//input [@id='login-button']"));
		login.click();
		
		//Point p=new Point (300,500);
		//driver.manage().window().setPosition(p);
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		
		WebElement addone=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		addone.click();
		
		WebElement addtwo=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
		addtwo.click();
		
		WebElement cardtotal=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cardtotal.click();
		
		WebElement check=driver.findElement(By.xpath("//button[@id='checkout']"));
		check.click();
		

	}

}