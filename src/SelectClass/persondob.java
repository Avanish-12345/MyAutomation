package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Screenshot.webelementscreenshot;

public class persondob
{
	//day by using index
	//month by using value
	//year by using visible text
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("Sign up for Facebook | Facebook"));
	WebElement daydropdown=driver.findElement(By.id("day"));
	Select dayselect=new Select(daydropdown);
	dayselect.selectByIndex(15);//value,visibility text
	Thread.sleep(2000);
	WebElement monthdropdown=driver.findElement(By.id("month"));
	Select monthselect=new Select(monthdropdown);
	monthselect.selectByValue("12");//visible text,index value
	Thread.sleep(2000);
	WebElement yearDropdown=driver.findElement(By.id("year"));
	Select yearselect=new Select(yearDropdown);
	yearselect.selectByVisibleText("2022");//index,value
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
		
}
}
