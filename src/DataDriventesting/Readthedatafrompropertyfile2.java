package DataDriventesting;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Readthedatafrompropertyfile2 
{
	public static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException
{
	FileInputStream fis= new FileInputStream("./files/commondata2.properties");
	Properties pobject=new Properties();
	pobject.load(fis);
	String browsername=pobject.getProperty("browser");
	System.out.println("browsername="+browsername);
	if(browsername.equals("chrome"))
	{
	driver=new ChromeDriver();	
	}
	else if(browsername.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browsername.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get(pobject.getProperty("url"));
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(70));
	wait.until(ExpectedConditions.titleIs("Manage Your Team’s Projects From Anywhere | Trello"));
	Actions actions=new Actions(driver);
	WebElement loginlink=driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI')]//a[text()='Log in']"));
	//Thread.sleep(2000);
	actions.click(loginlink).build().perform();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	WebElement emailtextfield=driver.findElement(By.id("username"));
	//emailtextfield.sendKeys(pobject.getProperty("username"));
	//Thread.sleep(2000);
	//emailtextfield.sendKeys(pobject.getProperty("username"));
	//Thread.sleep(2000);
	WebElement continueoption= driver.findElement(By.xpath("//span[text()='Continue']"));
	//continueoption.click();
	//Thread.sleep(2000);
	WebElement passwordtextfields=driver.findElement(By.id("password"));
	//passwordtextfiels.sendKeys(pobject.getProperty("password"));
	//Thread.sleep(2000);
	WebElement loginopt=driver.findElement(By.xpath("//span[text()='Log in']"));
	//loginopt.submit();
	Thread.sleep(4000);
	actions.sendKeys(emailtextfield, pobject.getProperty("username")).pause(4000).click(continueoption).pause(4000)
	.sendKeys(passwordtextfields, pobject.getProperty("password")).pause(2000).click(loginopt).build().perform();
	//Thread.sleep(2000);
	//loginopt.submit();
	
     
	
	
	
	
	
	
	
	
}
}
