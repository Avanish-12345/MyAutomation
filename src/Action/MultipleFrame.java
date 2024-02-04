package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	WebElement signupframe=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
	driver.switchTo().frame(signupframe);
    driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Admin@1234");
	driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
	driver.switchTo().defaultContent();
	WebElement loginframe= driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
	driver.switchTo().frame(loginframe);
	driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
	
	//WebElement rangeroverevoque= driver.findElement(By.xpath("//div/div/div[@id='container-36d6c3a9e3']"));
	//WebElement rangerovervelar=driver.findElement(By.xpath("//div/div/div[@id='container-035c6e4710']"));	
	//WebElement rangeroversport=driver.findElement(By.xpath("//div/div/div[@id='container-463e47dd44']"));
	//WebElement rangerover=driver.findElement(By.xpath("//div/div/div[@id='container-c657f5e335']"));
	//WebElement defender130=driver.findElement(By.xpath("//div/div/div[@id='container-6044827038']"));
	//WebElement defender110=driver.findElement(By.xpath("//div/div/div[@id='container-8ac5a2bb1c']"));
	//WebElement defender90=driver.findElement(By.xpath("//div/div/div[@id='container-5897f2577f']"));
	//WebElement discoverySport=driver.findElement(By.xpath("//div/div/div[@id='container-0989bc2cfd']"));
	//WebElement discovery=driver.findElement(By.xpath("//div/div/div[@id='container-eaf586f9d1']"));
		
}
}
