package Action;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloDragAndDrop 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://trello.com/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("Manage Your Team’s Projects From Anywhere | Trello"));
	WebElement loginlink= driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI')]"
			+ "//a[text()='Log in']"));
	loginlink.click();
	wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	Actions actions=new Actions(driver);
	WebElement emailtextfield= driver.findElement(By.id("username"));
	WebElement continueopt= driver.findElement(By.xpath("//span[text()='Continue']"));
	actions.sendKeys(emailtextfield, "dubeyavanish86@gmail.com").click(continueopt).perform();
	WebElement passwordtextfield= driver.findElement(By.id("password"));
	passwordtextfield.sendKeys("RamShivaye@15");
	WebElement loginopt=driver.findElement(By.xpath("//span[text()='Log in']"));
	loginopt.submit();
	//actions.click(loginlink).pause(1000).sendKeys(emailtextfield, "dubeyavanish86@gmail.com").pause(1000).click(continueopt).pause(1000)
	//.sendKeys(passwordtextfield, "RamShivaye@15").pause(1000).click(loginopt).build().perform();
	wait.until(ExpectedConditions.titleIs("Boards | Trello"));
	String actualboardpage=driver.getTitle();
	String exectedboardpage="Boards | Trello";
	if(actualboardpage.equals(exectedboardpage))
	{
		WebElement createnewboardoption=driver.findElement(By.xpath("//span[text()='Create new board']"));
		createnewboardoption.click();	
		//Thread.sleep(2000);	
		WebElement boardtitle=driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		boardtitle.sendKeys("Subjects");
		WebElement createoption= driver.findElement(By.xpath("//button[text()='Create']"));
		wait.until(ExpectedConditions.elementToBeClickable(createoption));
		if(createoption.isEnabled())
		{
		createoption.click();
		System.out.println("create button is enabled");
		wait.until(ExpectedConditions.titleIs("Subjects | Trello"));
		String actualnavigatedpage=driver.getTitle();
		String Expectednavigatedpage="Subjects | Trello";
		if(actualnavigatedpage.equals(Expectednavigatedpage))
		{
			WebElement listtitle=driver.findElement(By.name("Enter list title…"));
			listtitle.sendKeys("topics");
			WebElement addlist=driver.findElement(By.xpath("//button[text()='Add list']"));
			addlist.click();
			WebElement listtitle2=driver.findElement(By.name("Enter list title…"));
			listtitle2.sendKeys("Java");
			WebElement addlist2=driver.findElement(By.xpath("//button[text()='Add list']"));
			addlist2.click();
		WebElement listtitle3=driver.findElement(By.name("Enter list title…"));
		listtitle3.sendKeys("Manual");
			WebElement addlist3=driver.findElement(By.xpath("//button[text()='Add list']"));
			addlist3.click();
			WebElement listtitle4=driver.findElement(By.name("Enter list title…"));
			listtitle4.sendKeys("Sql");
		    WebElement addlist4=driver.findElement(By.xpath("//button[text()='Add list']"));
			addlist4.click();
			//WebElement listtitle5=driver.findElement(By.xpath("")));
			WebElement addacard=driver.findElement(By.xpath("//button[text()='Add a card']"));
			//h2[text()='topic']/../../..//button[text()='Add a card']
			addacard.click();
			WebElement enteralistitem=driver.findElement(By.xpath("//textarea[@data-testid='list-card-composer-textarea']"));
			enteralistitem.sendKeys("Joins");
			WebElement addcard=driver.findElement(By.xpath("//button[text()='Add card']"));
			addcard.click();
			WebElement enteralistitem2=driver.findElement(By.xpath("//textarea[@data-testid='list-card-composer-textarea']"));
			enteralistitem2.sendKeys("System testing");
			WebElement addcard2=driver.findElement(By.xpath("//button[text()='Add card']"));
			addcard2.click();
			WebElement enteralistitem3=driver.findElement(By.xpath("//textarea[@data-testid='list-card-composer-textarea']"));
			enteralistitem3.sendKeys("oops");
			WebElement addcard3=driver.findElement(By.xpath("//button[text()='Add card']"));
			addcard3.click();
			WebElement enteralistitem4=driver.findElement(By.xpath("//textarea[@data-testid='list-card-composer-textarea']"));
			enteralistitem4.sendKeys("Normal Form");
			WebElement addcard4=driver.findElement(By.xpath("//button[text()='Add card']"));
			addcard4.click();
			WebElement joins=driver.findElement(By.xpath("//a[text()='Joins']"));
			WebElement sql=driver.findElement(By.xpath("//textarea[text()='Sql']"));
			actions.dragAndDrop(joins, sql).build().perform();
			WebElement systemtesting= driver.findElement(By.xpath("//a[text()='System testing']"));
			WebElement manual=driver.findElement(By.xpath("//h2[text()='Manual']"));
			actions.clickAndHold(systemtesting).release(manual).build().perform();
			WebElement oops=driver.findElement(By.xpath("//a[text()='oops']"));
			WebElement java=driver.findElement(By.xpath("//h2[text()='Java']"));
			actions.clickAndHold(oops).release(java).build().perform();
			WebElement normalform=driver.findElement(By.xpath("//a[text()='Normal Form']"));
			actions.dragAndDrop(normalform,sql).build().perform();	
			Thread.sleep(4000);
		}
		else
		{
	System.out.println("Actual navigated page is not similar to expected navigated page");
		}
		}
		
		else
		{
		System.out.println("Create option is not enabled");
		}
	}
		else
		{
System.out.println("Actual board page and Expected board page is not similar");
		}
//driver.manage().window().minimize();
//driver.quit();
}
}

