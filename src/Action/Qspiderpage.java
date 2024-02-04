package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Qspiderpage
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
	WebElement firstframe=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.titleIs("DemoApps | Qspiders | iframes"));
	driver.switchTo().frame(0);

	driver.findElement(By.id("username")).sendKeys("avanish");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("qwty1234");
	Thread.sleep(4000);
	driver.findElement(By.id("submitButton")).submit();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
