package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keyup_Keydown 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usernametextfield=driver.findElement(By.id("username"));
	WebElement passwordtextfield= driver.findElement(By.id("password"));
	WebElement signinopt=driver.findElement(By.xpath("//button[text()='Sign in']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleIs("vtiger"));
	Actions actions=new Actions(driver);
	actions.keyDown(usernametextfield, Keys.CONTROL).sendKeys(usernametextfield, "A")
	.keyUp(usernametextfield, Keys.CONTROL).sendKeys(usernametextfield, Keys.DELETE).sendKeys(usernametextfield, "admin").perform();
	actions.keyDown(passwordtextfield, Keys.CONTROL).sendKeys(passwordtextfield, "A").keyUp(passwordtextfield, Keys.CONTROL)
	.sendKeys(passwordtextfield,Keys.DELETE).sendKeys(passwordtextfield, "admin").build().perform();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(signinopt));
	signinopt.submit();
	//Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
