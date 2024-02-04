package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Candidatesverificationoflogin 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginbutton=driver.findElement(By.name("login"));
	if(loginbutton.isEnabled())
	{
		loginbutton.submit();
		System.out.println("according to client..........true");
	}
	else
	{
		System.out.println("the button is disabled...........(method....false)");
		System.out.println("according to client.....false");
	}
}
}
