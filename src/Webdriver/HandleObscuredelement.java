package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HandleObscuredelement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement dismissopt=driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]/..//input[@type='submit']"));
		dismissopt.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div/a[text()='Customer Service']")).click();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
	}

}

// Absolute Xpath for customer service(amazon.in)
//html/body/div/header/div/div[4]/div[2]/div[2]/div/a[3]
//html/body/div/header/div/div[5]/div[2]/div/div/a[8].....yes
//div/a[text()='Customer Service']

