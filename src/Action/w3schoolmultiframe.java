package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schoolmultiframe 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	WebElement parentframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	Thread.sleep(2000);
	driver.switchTo().frame(parentframe);
	WebElement childframe=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
	driver.switchTo().frame(childframe);
	WebElement childtext=driver.findElement(By.xpath("//body/h1"));
	System.out.println(childtext.getText());
	//Thread.sleep(2000);
	driver.switchTo().parentFrame();
	WebElement parenttext1=driver.findElement(By.xpath("//body/h2"));
	System.out.println(parenttext1.getText());
	WebElement parenttext2=driver.findElement(By.xpath("//body/p"));
	System.out.println(parenttext2.getText());	
	driver.manage().window().minimize();
	driver.quit();
}
}
