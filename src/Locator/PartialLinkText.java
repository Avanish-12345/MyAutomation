package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement hendeLink=driver.findElement(By.linkText("हिन्दी"));
	hendeLink.click();
	Thread.sleep(2000);
	WebElement EnglishLink=driver.findElement(By.partialLinkText("English "));
	EnglishLink.click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
