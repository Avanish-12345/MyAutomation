package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyalttext 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement groceryImg= driver.findElement(By.xpath("//a[@aria-label='Mobiles']/div/div/div/div/img"));
	String grocerValue	=groceryImg.getAttribute("alt");
	System.out.println(grocerValue);
	driver.manage().window().minimize();
	driver.quit();
}
}
//"//a[@aria-label='Grocery']/div/div/div/div/img"
//"//a[@aria-label='Grocery']//img"