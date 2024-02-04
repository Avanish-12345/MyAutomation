package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod 
{
public static void main(String[]args)
{
//launch the browser
	//org.openqa.selenium.InvalidArgumentException
	//run....unchecked....selenium
	//if there is no protocol
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.findElement(By.id("email")).sendKeys("avanish@gmail.com");
 driver.findElement(By.name("pass")).sendKeys("@1234567890");
 driver.findElement(By.name("login")).click();
//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
}
}