package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeyswithitsprecondition 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	Thread.sleep(2000);
	WebElement usertextfield=driver.findElement(By.id("username"));
	usertextfield.clear();
	Thread.sleep(2000);
	usertextfield.sendKeys("admin");
	Thread.sleep(2000);
	WebElement passwordtextfield=driver.findElement(By.id("password"));
	passwordtextfield.clear();
	Thread.sleep(2000);
	passwordtextfield.sendKeys("admin");
	Thread.sleep(2000);
	WebElement Signinbutton=driver.findElement(By.xpath("//button[text()='Sign in']"));
	Thread.sleep(2000);
	Signinbutton.submit();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	
	
	
}
}
