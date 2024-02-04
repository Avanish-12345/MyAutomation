package TitleExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheUrl 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 String actualUrl=driver.getCurrentUrl();
	 System.out.println("actualUrl=" +actualUrl);
	 String expectedUrl="https://www.facebook.com/";
	 System.out.println("expectedUrl=" +expectedUrl);
	 if(actualUrl.equals(expectedUrl))
	 {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
	
}


}
