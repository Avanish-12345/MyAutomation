package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifytheYaxisofEmailandpassword 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	WebElement emailtextfield=driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
	WebElement passwordtextfield=driver.findElement(By.name("pass"));
	int emailyaxis=emailtextfield.getLocation().getY();
	System.out.println("emailyaxis="+emailyaxis);
	int passYaxis=passwordtextfield.getLocation().getY();
	System.out.println("passYaxis="+passYaxis);
	if(emailyaxis==passYaxis)
	{
		System.out.println("paas");
	}
	else
	{
		System.out.println("fail");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
