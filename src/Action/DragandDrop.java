package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://jqueryui.com/draggable/");
driver.switchTo().frame(0);
WebElement draggableelement=driver.findElement(By.id("draggable"));
Actions actions=new Actions(driver);
Thread.sleep(2000);
actions.dragAndDropBy(draggableelement, 100, 60).perform();
Thread.sleep(4000);
driver.manage().window().minimize();
driver.quit();
}
}
