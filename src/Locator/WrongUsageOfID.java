package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfID 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//Thread.sleep(2000);
	WebElement Emailtextfield=driver.findElement(By.id("email"));
	Emailtextfield.sendKeys("avanish@123456");
	Thread.sleep(2000);
	WebElement passwordtextfield=driver.findElement(By.id("pass"));
	passwordtextfield.sendKeys("afgt1234");
	Thread.sleep(2000);
	//login button is clicked when we use name but not clicked when we 
	// use id and class .
	WebElement loginbutton=driver.findElement(By.name("login"));
	//Thread.sleep(2000);
	loginbutton.click();
	//Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	
	
	}

}
