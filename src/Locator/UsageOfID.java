package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfID 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement passwordtextfield=driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		passwordtextfield.sendKeys("afg1234");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
