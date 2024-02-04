/* Launch the 5  windows 
 1.Transfer your driver control to the first windows and verify and validate the url of the page
 2. Transfer the driver control to the second window and verify the title.
 3.Transfer the driver control to the third window and set the size the defined size is 200,600
 4. Transfer the driver control to the fourth window and close the window.
 5.Terminate the session

 */

package Webdriver;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScanariosWebdriver
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/login/identify/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/forgot");
		Thread.sleep(2000);
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		for (String Wid : allWids) 
		{
			String wUrl=driver.switchTo().window(Wid).getCurrentUrl();
			String Widtitle = driver.switchTo().window(Wid).getTitle();
			if (wUrl.equals("https://www.facebook.com/"))
			{
				System.out.println(wUrl);
				System.out.println("Pass:Verify and validate that Login page for facebook is first window");
			
			}
			else if (Widtitle.equals("Sign up for Facebook | Facebook"))
			{
				System.out.println(Widtitle);
				System.out.println("Pass: verify and validate that sign up page for facebook  is second window");
			}
			else if (Widtitle.equals("Forgotten Password | Can't Log In | Facebook")) 
			{	
			Dimension ds=new Dimension(200, 600);
			driver.manage().window().setSize(ds);
			}
			else if (Widtitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
			{
				driver.close();
			}
			else
			{
				System.out.println("Fail");
			}
			
		}
		driver.quit();
	}
}
