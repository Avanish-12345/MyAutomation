import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
WebElement EmailTextFields=driver.findElement(By.id("email"));
EmailTextFields.sendKeys("avanish");
Thread.sleep(2000);
WebElement PassTextFields=driver.findElement(By.id("pass"));
PassTextFields.sendKeys("fgfgfgg");
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
	//driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
}
}
