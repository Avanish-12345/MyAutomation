package DataDriventesting;

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

public class Readthedatafrompropertyfilevtiger 
{
	public static WebDriver driver;


public static void main(String[] args) throws IOException, InterruptedException 
{
	FileInputStream fis=new FileInputStream("./files/commondata1.properties");
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
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(pobject.getProperty("url"));
	Thread.sleep(2000);
	WebElement usernametextfield=driver.findElement(By.id("username"));
	
}
}
