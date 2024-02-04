package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementReverse 
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
actions.moveToElement(studioopt).pause(1000).moveToElement(beautyopt).pause(1000).moveToElement(homelivingopt).pause(1000).
moveToElement(kidsopt).pause(1000).moveToElement(womenopt).pause(1000).moveToElement(menopt).build().perform();
//actions.moveToElement(studioopt, 0, 0).moveToElement(studioopt, -45, 0).pause(4000).moveToElement(beautyopt, -87, 0)
//.pause(2000).moveToElement(homelivingopt,-108 , 0).pause(2000).moveToElement(kidsopt, -98, 0).pause(2000)
//.moveToElement(womenopt, -74, 0).pause(2000).moveToElement(menopt, -73, 0).build().perform();
//actions.moveToElement(studioopt, 0, 0).pause(2000).moveToElement(studioopt, -45, 0).pause(2000)
//.moveToElement(studioopt, -87, 0).pause(2000).moveToElement(studioopt, -195, 0).pause(2000)
//.moveToElement(studioopt, -293, 0).pause(2000).moveToElement(studioopt, -367, 0).pause(2000)
//.moveToElement(studioopt, -440, 0).build().perform();
driver.manage().window().minimize();
driver.quit();
}
}


