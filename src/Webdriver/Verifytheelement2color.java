package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Verifytheelement2color
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement createbutton= driver.findElement(By.xpath("//a[text()='Create new account']"));
String createbuttonvalue=createbutton.getCssValue("background-color");
System.out.println("createbuttonvalue="+createbuttonvalue);
String hexadecimalvalue=Color.fromString(createbuttonvalue).asHex();
System.out.println("hexadecimalvalue="+hexadecimalvalue);
}
}
