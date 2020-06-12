package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	static WebDriver driver;

	public static void openBrowser()
	{
		driver = new ChromeDriver();
		
	}
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public static void navigateToApp(String url)
	{ driver.get(url);
		}
	
	public static void enterUserid(String locValue,String userId)
	{
		driver.findElement(By.id(locValue)).sendKeys(userId);
	}
	public static void enterPassWord(String locValue,String userId)
	{
		driver.findElement(By.id(locValue)).sendKeys(userId);
	}
	public static void signIn(String loc,String locValue)
	{   if (loc.equals("id")) {
		driver.findElement(By.id(locValue)).click();}
	    else if (loc.equals("name")) {
		driver.findElement(By.name(locValue)).click();
	}
	}
	public static String errorMsg(String locValue)
	{ String msg = driver.findElement(By.cssSelector(locValue)).getText();
	   return msg;
	
	}
	public static void closeApp()
	{
		driver.close();
	}
}
