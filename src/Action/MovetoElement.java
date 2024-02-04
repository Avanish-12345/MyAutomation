package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Screenshot.webelementscreenshot;

public class MovetoElement
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	WebElement menopt= driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Men']"));
	WebElement womenopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Women']"));
	WebElement kidsopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Kids']"));
	WebElement homelivingopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Home & Living']"));
	WebElement beautyopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Beauty']"));
	WebElement studioopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Studio']"));
Actions actions=new Actions(driver);
//actions.moveToElement(menopt).pause(1000).moveToElement(womenopt).pause(1000).moveToElement(kidsopt).pause(1000).
//moveToElement(homelivingopt).pause(1000).moveToElement(beautyopt).pause(1000).moveToElement(studioopt).build().perform();
//actions.moveToElement(menopt, 0, 0).pause(2000).moveToElement(menopt, 75, 0).pause(2000).moveToElement(womenopt, 74, 0)
//.pause(2000).moveToElement(kidsopt, 98, 0).pause(2000).moveToElement(homelivingopt, 108, 0)
//.pause(2000).moveToElement(beautyopt, 87, 0).build().perform();
actions.moveToElement(menopt, 0, 0).pause(2000).moveToElement(menopt, 75, 0).pause(2000).moveToElement(menopt, 147, 0)
.pause(2000).moveToElement(menopt, 245, 0).pause(2000).moveToElement(menopt, 353, 0).pause(2000)
.moveToElement(menopt, 441, 0).build().perform();
driver.manage().window().minimize();
driver.quit();

	
}
}
