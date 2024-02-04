package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usageoftitle
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String actualtitle=driver.getTitle();
System.out.println("actualtitle="+actualtitle);
String expectedResult="Facebook – log in or sign up";
if(actualtitle.equals(expectedResult))
{
	System.out.println("Paas:the actual title of facebook login page is verified and found correct");
	
}
else
{
	System.out.println("Fail:the actual title of facebook login page is verified and found incorrect");
}

}
}
