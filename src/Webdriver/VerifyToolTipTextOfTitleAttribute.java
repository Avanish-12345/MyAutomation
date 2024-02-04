package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTipTextOfTitleAttribute 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement flipkartlogo=driver.findElement(By.xpath("//img[contains(@src,'https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/fkh')]"));
		String flipkartlogotitle=flipkartlogo.getAttribute("title");
		System.out.println("flipkartlogotitle="+flipkartlogotitle);
				
	}

}
