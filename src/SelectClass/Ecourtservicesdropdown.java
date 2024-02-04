package SelectClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecourtservicesdropdown 
{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis2= new FileInputStream("./files/commondata3.properties");
		Properties pobject=new Properties();
		pobject.load(fis2);
		String browsername=pobject.getProperty("browser");
		System.out.println("browsername="+browsername);
		if(browsername.equals("chrome"))
		{
		driver=new ChromeDriver();	
		}
		else if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get(pobject.getProperty("url"));
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.titleIs("Home - eCourt India Services"));
		Thread.sleep(2000);
		WebElement crossopt=driver.findElement(By.xpath("//div[@class='modal-header text-center align-items-start']//button[@aria-label='Close']"));
		crossopt.click();
		WebElement statedropdown=driver.findElement(By.id("sess_state_code"));
		WebElement districtdropdown=driver.findElement(By.id("sess_dist_code"));
		WebElement courtcomplexdropdown= driver.findElement(By.id("court_complex_code"));
		Select stateSelect=new Select(statedropdown);
		List<WebElement> allstateselectoptions=stateSelect.getOptions();
		for(WebElement stateopts:allstateselectoptions)
		{
			if(stateopts.isSelected())
			{
				Select districtselect=new Select(districtdropdown);
				List<WebElement> alldistrictselectoptions=districtselect.getOptions();
				for(WebElement districtopts:alldistrictselectoptions)
				{
					if(districtopts.isSelected())
					{	
					
						Select courtcomplexselect=new Select(courtcomplexdropdown);
						List<WebElement> allcourtcomplexselectoptions=courtcomplexselect.getOptions();
						for(WebElement courtcomplexselect2:allcourtcomplexselectoptions)
						{
							if(courtcomplexselect.isMultiple())
							{
								System.out.println("the dropdown is multiselect");
							}
							else
							{
								courtcomplexselect.getOptions();
								Thread.sleep(2000);
								WebElement courtestablishmentdropdown=driver.findElement(By.id("court_est_code"));
								Select courtestablishmentselect= new Select(courtestablishmentdropdown);
								courtestablishmentselect.selectByVisibleText("CIVIL JUDE AND JMFC, MUDIGERE");
								Thread.sleep(2000);
							}
						}
					}
				}
			}
		}
	
}
}
