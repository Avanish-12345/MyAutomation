package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataAfterCheckingForValue 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement firstnameTextField=driver.findElement(By.name("firstname"));
	String firstnamevalue=firstnameTextField.getAttribute("value");
	System.out.println("firstnamevalue="+firstnamevalue);
	if(firstnamevalue.isEmpty())
	{
		firstnameTextField.sendKeys("qsp");
	}
	else
	{
		firstnameTextField.clear();
		firstnameTextField.sendKeys("abc");
	}
	
}
}
