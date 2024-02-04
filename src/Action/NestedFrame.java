package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demo.automationtesting.in/Frames.html");
WebElement selectlink=driver.findElement(By.linkText("Iframe with in an Iframe"));
selectlink.click();
WebElement parentframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
Thread.sleep(2000);
driver.switchTo().frame(parentframe);
WebElement childframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
Thread.sleep(2000);
driver.switchTo().frame(childframe);
Thread.sleep(2000);
WebElement inputtext=driver.findElement(By.xpath("//input[@type='text']"));
Thread.sleep(2000);
inputtext.sendKeys("success");
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();

}
}
