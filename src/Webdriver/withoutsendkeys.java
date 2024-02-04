package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutsendkeys
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailtextfield=driver.findElement(By.id("email"));
	Thread.sleep(2000);
	emailtextfield.sendKeys(Keys.chord("abc1234@gmail.com"));
	Thread.sleep(2000);
	driver.manage().window().minimize();
	
	
	
}
}
