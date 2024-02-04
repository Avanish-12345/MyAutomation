package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifythetagtextfacebook
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement	textcheck=driver.findElement(By.xpath("//h2[@class='_8eso']"));
	String textname=textcheck.getText();
	if(textname.equals("Facebook helps you connect and share with the people in your life."))
	{
		System.out.println("paas");
	}
	else
	{
		System.out.println("fail");
	}
	}

}
