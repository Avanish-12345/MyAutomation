package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectusageofsubmitMerthod 
{
	//<form>
	//<button/input type="submit/"button">
	//</form>
public static void main(String[] args) throws InterruptedException
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://shop-global.malaicha.com/login");
Thread.sleep(4000);
 WebElement signinbutton=driver.findElement(By.xpath("//button[@type='submit']"));
 Thread.sleep(4000);
 driver.manage().window().minimize();
 Thread.sleep(4000);
 driver.quit();

}
}
