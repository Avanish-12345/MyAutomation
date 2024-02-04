package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifythetagtextforgottenpwdlink 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement forgottenpwdlink=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/')]"));
	String linktext=forgottenpwdlink.getText();
	if(linktext.equals("Forgotten password?"))
	{
		System.out.println("paas");
		forgottenpwdlink.click();
	}
	else
	{
		System.out.println("fail");
	}
	
}
}
