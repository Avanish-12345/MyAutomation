package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementscreenshot
{
public static void main(String[] args) throws IOException, InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.the-maharajas.com/");
driver.manage().window().maximize();
WebElement maharajalogo=driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-4 col-4 logo-wrap']/a/img"));
File tempFile=maharajalogo.getScreenshotAs(OutputType.FILE);
File permFile=new File("./errorshots/maharajalogo.png");
Thread.sleep(2000);
FileUtils.copyFile(tempFile, permFile);
driver.manage().window().minimize();
driver.quit();


}
}
