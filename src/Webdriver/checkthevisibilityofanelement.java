package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkthevisibilityofanelement
{
//element is not present in the UI of an application,but the element source code is
//	present in the HTML document.[not to use isDisplayed() upon this scenario]
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement invisibleelement=driver.findElement(By.name("preferred_pronoun"));
		if(invisibleelement.isDisplayed())
		{
			System.out.println("method....true");
			System.out.println("client.....false");
		}
		else
		{
			System.out.println("method.......false");
			System.out.println("client........true");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
