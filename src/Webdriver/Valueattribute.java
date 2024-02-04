package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valueattribute
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	Thread.sleep(2000);
	WebElement usernameTextField=driver.findElement(By.id("username"));
	String usernameValue=usernameTextField.getAttribute("value");
	if(usernameValue.isEmpty())
	{
		usernameTextField.sendKeys("abc");
	}
	else
	{
		usernameTextField.clear();
		Thread.sleep(2000);
		usernameTextField.sendKeys("xyz");
	}
	
}
}
