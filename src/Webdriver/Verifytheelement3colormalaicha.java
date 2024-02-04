package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Verifytheelement3colormalaicha 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	WebElement registerbutton=driver.findElement(By.xpath("//button[text()='Register']"));
	String registerbuttonvalue=registerbutton.getCssValue("background-color");
	System.out.println("registerbuttonvalue="+registerbuttonvalue);
	String hexadecimalvalue=Color.fromString(registerbuttonvalue).asHex();
	System.out.println("hexadecimalvalue="+hexadecimalvalue);
}
}
