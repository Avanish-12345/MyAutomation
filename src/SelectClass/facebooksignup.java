package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebooksignup
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/signup");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
	wait.until(ExpectedConditions.titleIs("Sign up for Facebook | Facebook"));
	//Thread.sleep(2000);
	Actions actions=new Actions(driver);
	WebElement firstnametextfield=driver.findElement(By.name("firstname"));
	//actions.sendKeys(firstnametextfield, "Shambhu");
	//firstnametextfield.sendKeys("Shambhu");
	//Thread.sleep(2000);
	WebElement surnametextfield=driver.findElement(By.name("lastname"));
	//actions.sendKeys(surnametextfield, "sharan");
	//surnametextfield.sendKeys("sharan");
	//Thread.sleep(2000);
	WebElement mobilenotextfield=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	//actions.sendKeys(mobilenotextfield, "6767676767");
	//mobilenotextfield.sendKeys("6767676767");
	//Thread.sleep(2000);
	WebElement newpasswordtextfield=driver.findElement(By.xpath("//input[@type='password']"));
	//actions.sendKeys(newpasswordtextfield, "Ramshivaye@16");
	//newpasswordtextfield.sendKeys("Ramshivaye@16");
	//Thread.sleep(2000);
	actions.sendKeys(firstnametextfield, "Shambhu").pause(2000).sendKeys(surnametextfield, "sharan").pause(2000)
	.sendKeys(mobilenotextfield, "6767676767").pause(2000).sendKeys(newpasswordtextfield, "Ramshivaye@16").build().perform();
	Thread.sleep(2000);
	WebElement daydropdown=driver.findElement(By.id("day"));
	Select daySelect=new Select(daydropdown);
	daySelect.selectByIndex(25);
	Thread.sleep(2000);
	WebElement monthdropdown=driver.findElement(By.id("month"));
	Select monthselect=new Select(monthdropdown);
	monthselect.selectByValue("5");
	Thread.sleep(2000);
	WebElement yeardropdown=driver.findElement(By.id("year"));
	Select yearselect=new Select(yeardropdown);
	yearselect.selectByVisibleText("2004");
	Thread.sleep(2000);
	WebElement maleradio=driver.findElement(By.xpath("//label[text()='Male']"));
	//maleradio.click();
	WebElement signupopt=driver.findElement(By.xpath("//div[@class='_1lch']//button[text()='Sign Up']"));
	//signupopt.click();
	actions.click(maleradio).pause(2000).click(signupopt).build().perform();
	Thread.sleep(2000);
	
	driver.manage().window().minimize();
	driver.quit();
}
}
