package Webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class PlayWithWindows 
{
public static void main(String[] args)throws InterruptedException
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();//method chaining
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.facebook.com/signup");
Thread.sleep(2000);
//capture all the window id's
Set<String> allWids = driver.getWindowHandles();
System.out.println("allWids");
for(String wid:allWids)
{
	String WidTitle=driver.switchTo().window(wid).getTitle();
	System.out.println("WidTitle");
	if(WidTitle.equals("Facebook – log in or sign up"))
	{
	}
	else if(WidTitle.equals("Sign up for Facebook | Facebook"))
	{
	String signuppageURL=driver.getCurrentUrl();
	System.out.println("signuppageURL=" +signuppageURL);
	//size
int signupHeight=driver.manage().window().getSize().getHeight();
System.out.println("signupHeight="+signupHeight);
int signupwidth=driver.manage().window().getSize().getWidth();
System.out.println("signupwidth="+signupwidth);
//position
int signupxAxis=driver.manage().window().getPosition().getX();
System.out.println("signupxAxis="+signupxAxis);
int signupyAxis=driver.manage().window().getPosition().getY();
System.out.println("signupyAxis="+signupyAxis);
	}
}


}
}
