package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifythetagnamedropdownfb 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
	WebElement femaletextcheck =driver.findElement(By.xpath("//input[@name='sex']/..//label[text()='Female']"));
	String textname=femaletextcheck.getText();
	if(textname.equals("Female"))
	{
		System.out.println("paas");
	}
	else
	{
		System.out.println("fail");
	}
	
		
		
	}

}
