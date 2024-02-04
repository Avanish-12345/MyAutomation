package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofEnuminsendkeys 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver()	;
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/index.php");
Thread.sleep(2000);
WebElement usernameTextfield=driver.findElement(By.id("username"));
usernameTextfield.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
usernameTextfield.sendKeys(Keys.DELETE);
Thread.sleep(2000);
usernameTextfield.sendKeys(Keys.chord("admin"));
Thread.sleep(2000);
WebElement passwordtextfield=driver.findElement(By.id("password"));
passwordtextfield.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
passwordtextfield.sendKeys(Keys.DELETE);
Thread.sleep(2000);
passwordtextfield.sendKeys(Keys.chord("admin"));
WebElement Signinbutton=driver.findElement(By.xpath("//button[text()='Sign in']"));
Signinbutton.submit();
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
}
}
