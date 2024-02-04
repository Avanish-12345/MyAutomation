package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions actions=new Actions(driver);
	WebElement doubleclickele= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	//actions.doubleClick(doubleclickele).build().perform();
	//actions.click(doubleclickele).build().perform();
	actions.contextClick(doubleclickele).build().perform();
			
}

}
