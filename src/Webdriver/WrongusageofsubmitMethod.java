package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongusageofsubmitMethod 
{
	//java.lang.unsupportedoperationException
	//run....unchecked
	
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	 WebElement registeroption=driver.findElement(By.xpath("//button[text()='Register']"));
	 registeroption.submit();
	 //Thread.sleep(6000);
	 driver.manage().window().minimize();
	// Thread.sleep(4000);
	 driver.quit();
}
}
