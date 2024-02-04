package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifythestateofElement
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	Thread.sleep(2000);
	WebElement submitopt=driver.findElement(By.name("submit"));
	if(submitopt.isEnabled())
	{
		System.out.println("The submit option is enabled.....Method(true)");
		System.out.println("But according to client it is false");
		submitopt.click();
	}
	
	else
	{
		System.out.println("The submitopt is enabled.......method(false)");
		System.out.println("But according to client it is true");
		WebElement acceptTermsofServicecheckboxopt=driver.findElement(By.id("confbtn"));
		acceptTermsofServicecheckboxopt.click();
		Thread.sleep(2000);
		WebElement closeopt=driver.findElement(By.xpath("//button[text()='Close']"));
		closeopt.click();
		Thread.sleep(2000);
		submitopt.click();
		Thread.sleep(2000);
		
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
