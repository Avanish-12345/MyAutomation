package Screenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplementationofimplicitandExplicitwait 
{
public static void main(String[] args)
{
	WebDriver driver=new 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://trello.com/");
	WebElement loginlink=driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup')]"
			+ "//a[text()='Log in']"));
	loginlink.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	WebElement emailtextfield=driver.findElement(By.id("username"));
	emailtextfield.sendKeys("dubeyavanish86@gmail.com");
	WebElement continuebutton=driver.findElement(By.id("login-submit"));
	continuebutton.submit();
	WebElement passwordtextfield=driver.findElement(By.id("password"));
	passwordtextfield.sendKeys("RamShivaye@15");
	WebElement loginbutton=driver.findElement(By.id("login-submit"));
	loginbutton.submit();
	WebElement createbutton=driver.findElement(By.xpath("//span[text()='Create new board']"));
	
	
	
	
}
}
