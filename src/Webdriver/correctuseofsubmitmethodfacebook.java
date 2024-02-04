package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class correctuseofsubmitmethodfacebook 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(4000);
WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
loginbutton.submit();
Thread.sleep(4000);
driver.manage().window().minimize();
driver.quit();


}
}