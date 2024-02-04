package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText 
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement forgottenpwdLink=driver.findElement(By.linkText("Forgotten password?"));
forgottenpwdLink.click();
driver.manage().window().minimize();
driver.quit();
}
}
