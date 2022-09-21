package P1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 
public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Advanced Locators-gotoBrowser-forgotpass-takePass-Login-Logout
		String name="rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//waitTogetSometime
		String password=getPassword(driver);//get Password from getPasswordMethod
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name); //id
		driver.findElement(By.name("inputPassword")).sendKeys(password);//name
		driver.findElement(By.className("signInBtn")).click();//className
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	
	
	
	}//Please use temporary password 'rahulshettyacademy' to Login.


	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();//linkankertag
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //clickonResetPassword
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];//splitAnsSAVEindex0Element
		//String getText=driver.findElement(By.tagName("p")).getText();
		//String[] getTextArray=getText.split("'");//Please use temporary password '-0//rahulshettyacademy' to Login.-01
		//String password=getTextArray[1].split("'")[0];//access 0th Elmnt from array
		
		return password;//rahulshettyacademy
		
	}
	

}
