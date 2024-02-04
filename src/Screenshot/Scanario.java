package Screenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.runtime.model.ExceptionDetails;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scanario 
{
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://trello.com/");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("Manage Your Team’s Projects From Anywhere | Trello"));
	WebElement loginlink=driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI')]//a[text()='Log in']"));
	loginlink.click();
	wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	String actualloginpage= driver.getTitle();
	String expectedloginpage = "Log in to continue - Log in with Atlassian account";
	if(actualloginpage.equals(expectedloginpage))
	{
		System.out.println("----");
		WebElement emailtextfield=driver.findElement(By.id("username"));
		emailtextfield.sendKeys("dubeyavanish86@gmail.com");
		WebElement continuebutton=driver.findElement(By.id("login-submit"));
		continuebutton.submit();
		WebElement passwordtextfield=driver.findElement(By.id("password"));
		passwordtextfield.sendKeys("RamShivaye@15");
		WebElement loginbutton=driver.findElement(By.id("login-submit"));
		loginbutton.submit();
		wait.until(ExpectedConditions.titleIs("Boards | Trello"));
		String actualboardpage=driver.getTitle();
		String exectedboardpage="Boards | Trello";
		
		if(actualboardpage.equals(exectedboardpage))
		{
			WebElement createnewboardoption=driver.findElement(By.xpath("//span[text()='Create new board']"));
			createnewboardoption.click();	
			WebElement boardtitle=driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
			boardtitle.sendKeys("selenium");
			WebElement createoption= driver.findElement(By.xpath("//button[text()='Create']"));
			wait.until(ExpectedConditions.elementToBeClickable(createoption));
			if(createoption.isEnabled())
			{
			createoption.click();
			System.out.println("create button is enabled");
			wait.until(ExpectedConditions.titleIs("selenium | Trello"));
			String actualnavigatedpage=driver.getTitle();
			String Expectednavigatedpage="selenium | Trello";
			if(actualnavigatedpage.equals(Expectednavigatedpage))
			{
				WebElement seleniumboard=driver.findElement(By.xpath("//a[@title='selenium (currently active)']"));
				seleniumboard.click();
				WebElement threedots=driver.findElement(By.xpath("//a[@title='selenium (currently active)']/..//span[@data-testid='OverflowMenuHorizontalIcon']"));
				threedots.click();
				WebElement closeboard=driver.findElement(By.xpath("//span[text()='Close board']"));
				closeboard.click();
				WebElement closeoption=driver.findElement(By.xpath("//button[text()='Close']"));
				closeoption.click();
				WebElement permanentlydeleteboard= driver.findElement(By.xpath("//button[text()='Permanently delete board']"));
				permanentlydeleteboard.click();
				WebElement deleteoption=driver.findElement(By.xpath("//button[text()='Delete']"));
				deleteoption.click();
				wait.until(ExpectedConditions.titleIs("Boards | Trello"));
				String actualtrelloboardpage=driver.getTitle();
				String expectedtrelloboardpage="Boards | Trello";
				if(actualtrelloboardpage.equals(expectedtrelloboardpage))
				{
					System.out.println("yes it is a trello page");
					WebElement menuoption=driver.findElement(By.xpath("//div[@data-testid='header-member-menu-avatar']"));
					menuoption.click();
					WebElement logout=driver.findElement(By.xpath("//span[text()='Log out']"));
					wait.until(ExpectedConditions.elementToBeClickable(logout));
					logout.click();
					wait.until(ExpectedConditions.titleIs("Log out of your Atlassian account - Log in with Atlassian account"));
					String actuallogoutpage=driver.getTitle();
					String expectedlogoutpage="Log out of your Atlassian account - Log in with Atlassian account";
					if(actuallogoutpage.equals(expectedlogoutpage))
					{
						WebElement logoutoption=driver.findElement(By.xpath("//span[text()='Log out']"));
						logoutoption.submit();
						String actualhomepage=driver.getTitle();
						String expectedhomepage="Manage Your Team’s Projects From Anywhere | Trello";
						if(actualhomepage.equals(expectedhomepage))
						{
							System.out.println("yes it is home page");
						}
						else
						{
							System.out.println("No it is not a home page");
						}
					}
						else
				{
					System.out.println("No it is not a logout page");
				}
					}
			else
			{
				System.out.println("No it is not a trello page");
			}
					}
	else 
	{
		System.out.println("No it is not a navigated page");	
	}
					}
else
	{
	System.out.println("create option is disabled");	
	}
					}
				else
				{
				System.out.println("No it is not a board page");	
				}
					}
				else
				{
					System.out.println("No it is not a login page");
				}
	driver.manage().window().minimize();
	driver.quit();
					}
	
					}
				
