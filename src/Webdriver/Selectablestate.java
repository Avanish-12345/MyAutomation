package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectablestate 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	Thread.sleep(2000);
	WebElement customradiobutton=driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']"));
	if(customradiobutton.isSelected())
	{
		System.out.println("according to the method.......true");
		System.out.println("according to the client it is false because it is not selected");
	}
	else
	{
		System.out.println("according to the method...false");
		System.out.println("according to the client it is true");
		customradiobutton.click();
	}
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
