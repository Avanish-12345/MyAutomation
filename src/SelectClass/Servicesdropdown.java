package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Screenshot.webelementscreenshot;

public class Servicesdropdown 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
	wait.until(ExpectedConditions.titleIs("Home - eCourt India Services"));
	Thread.sleep(2000);
	WebElement crossopt=driver.findElement(By.xpath("//div[@class='modal-header text-center align-items-start']//button[@aria-label='Close']"));
	crossopt.click();
	WebElement statedropdown=driver.findElement(By.id("sess_state_code"));
	WebElement districtdropdown=driver.findElement(By.id("sess_dist_code"));
	WebElement courtcomplexdropdown= driver.findElement(By.id("court_complex_code"));
	Select stateSelect=new Select(statedropdown);
	stateSelect.selectByVisibleText("Karnataka");
	Thread.sleep(2000);
	Select districtselect=new Select(districtdropdown);
	districtselect.selectByVisibleText("CHIKKAMAGALURU");
	Thread.sleep(2000);
	Select courtcomplexselect=new Select(courtcomplexdropdown);
	List<WebElement> allcourtcomplexopts=courtcomplexselect.getOptions();
	for(WebElement courtcomplexopt:allcourtcomplexopts)
	{
		if(courtcomplexselect.isMultiple())
		{
			System.out.println("The drop is multiselect");
		}
		else
		{
			courtcomplexselect.selectByVisibleText("Court Complex-Mudigere");
			Thread.sleep(2000);
			WebElement courtestablishmentdropdown=driver.findElement(By.id("court_est_code"));
			Select courtestablishmentselect= new Select(courtestablishmentdropdown);
			courtestablishmentselect.selectByVisibleText("CIVIL JUDE AND JMFC, MUDIGERE");
			Thread.sleep(2000);
		}
	}
		
}
}
