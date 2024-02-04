package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifythesizeofemailandpassword 
{
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//email
	WebElement emailTextfield=driver.findElement(By.id("email"));
	int emailHeight=emailTextfield.getSize().getHeight();
	System.out.println("emailHeight="+emailHeight);
	int emailwidth=emailTextfield.getSize().getWidth();
	System.out.println("emailwidth="+emailwidth);
//password
	WebElement passtextfield=driver.findElement(By.id("passContainer"));
	int passHeight=passtextfield.getSize().getHeight();
	System.out.println("passHeight="+passHeight);
	int passwidth=passtextfield.getSize().getWidth();
	System.out.println("passwidth="+passwidth);
	if(emailHeight==passHeight && emailwidth==passwidth)
	{
		System.out.println("pass");
	}
	else
	{
	System.out.println("fail");
	}

}
}
