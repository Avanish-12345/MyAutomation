package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifythesizeoffbsignuppage 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
WebElement firstnametextfield=driver.findElement(By.name("firstname"));
WebElement surnametextfield=driver.findElement(By.name("lastname"));
WebElement emailaddresstextfield=driver.findElement(By.name("reg_email__"));
WebElement newpasswordtextfield=driver.findElement(By.name("reg_passwd__"));
//First name
int firstnameheight=firstnametextfield.getSize().getHeight();
System.out.println("firstnameheight="+firstnameheight);
int firstnamewidth=firstnametextfield.getSize().getWidth();
System.out.println("firstnamewidth="+firstnamewidth);
//Surname
int surnameheight=surnametextfield.getSize().getHeight();
System.out.println("surnameheight="+surnameheight);
int surnamewidth=surnametextfield.getSize().getWidth();
System.out.println("surnamewidth="+surnamewidth);
//Email Address
int emailaddressheight=emailaddresstextfield.getSize().getHeight();
System.out.println("emailaddressheight="+emailaddressheight);
int emailaddresswidth=emailaddresstextfield.getSize().getWidth();
System.out.println("emailaddresswidth="+emailaddresswidth);
// New Password
int newpasswordheight=newpasswordtextfield.getSize().getHeight();
System.out.println("newpasswordheight="+newpasswordheight);
int newpasswordwidth =newpasswordtextfield.getSize().getWidth();
System.out.println("newpasswordwidth="+newpasswordwidth); 
if(firstnameheight==surnameheight && firstnamewidth==surnamewidth)
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
if(emailaddressheight==newpasswordheight && emailaddresswidth==newpasswordwidth)
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
driver.manage().window().minimize();
driver.quit();
}
}
