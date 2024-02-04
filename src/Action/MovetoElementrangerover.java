package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Screenshot.webelementscreenshot;

public class MovetoElementrangerover 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.landrover.in/range-rover/index.html");
	WebElement vehicleopt=driver.findElement(By.xpath("//span[text()='VEHICLES']"));
	Thread.sleep(2000);
	vehicleopt.click();
	WebElement rangeroverevoque= driver.findElement(By.xpath("(//div[@id='container-36d6c3a9e3'])[1]"));
	WebElement rangerovervelar=driver.findElement(By.xpath("(//div[@id='container-035c6e4710'])[2]"));	
	WebElement rangeroversport=driver.findElement(By.xpath("(//div[@id='container-463e47dd44'])[3]"));
	WebElement rangerover=driver.findElement(By.xpath("(//div[@id='container-c657f5e335'])[4]"));
	WebElement defender130=driver.findElement(By.xpath("(//div[@id='container-6044827038'])[5]"));
	WebElement defender110=driver.findElement(By.xpath("(//div[@id='container-8ac5a2bb1c'])[6]"));
	WebElement defender90=driver.findElement(By.xpath("(//div[@id='container-5897f2577f'])[7]"));
	WebElement discoverySport=driver.findElement(By.xpath("(//div[@id='container-0989bc2cfd'])[8]"));
	WebElement discovery=driver.findElement(By.xpath("(//div[@id='container-eaf586f9d1'])[9]"));
	Actions actions=new Actions(driver);
	actions.moveToElement(rangeroverevoque).pause(2000).moveToElement(rangerovervelar).pause(2000)
	.moveToElement(rangeroversport).pause(2000).moveToElement(rangerover).pause(2000).moveToElement(defender130).pause(2000)
			.moveToElement(defender110).pause(2000).moveToElement(defender90).pause(2000).moveToElement(discoverySport)
			.pause(2000).moveToElement(discovery).pause(2000).build().perform();
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.titleIs("Range Rover 2023 | Luxury Performance SUV | Range Rover"));
	//actions.moveToElement(rangerover2,0,0).pause(2000).moveToElement(rangerover2,0,-16).pause(2000)
	//.moveToElement(rangeroverevoque, 0, -44).pause(2000)
//	.moveToElement(rangerovervelar, 0, -56).pause(2000).moveToElement(rangeroversport, 0, -84).pause(2000)
//	.moveToElement(rangerover, 0, -112).pause(2000).moveToElement(defender,0,-16).pause(2000).moveToElement(defender130, 0, 28)
//.pause(2000)
//	.moveToElement(defender110, 0, 28).pause(2000).moveToElement(defender90, 0,28).pause(2000)
//.moveToElement(discoveryopt,0,16).pause(2000).moveToElement(discoverysport, 0, 28).pause(2000).moveToElement(discovery, 0, 28)
//	.build().perform();
driver.manage().window().minimize();
driver.quit();
	



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
