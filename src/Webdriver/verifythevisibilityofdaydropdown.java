package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifythevisibilityofdaydropdown
{
//Element is also present and source code is also present
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement daydropdown=driver.findElement(By.id("day"));
		if(daydropdown.isDisplayed())
		{
			System.out.println("according to the method........true");
			System.out.println("according to the client..........true");
			
		}
		else
		{
			System.out.println("according to the method.....false");
			System.out.println("according to the client.........false");
			
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
