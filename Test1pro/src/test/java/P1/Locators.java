package P1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Locators
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//waitTogetSometime
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("abhay"); //id
		driver.findElement(By.name("inputPassword")).sendKeys("abhay");//name
		driver.findElement(By.className("signInBtn")).click();//className
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//cssSelector-tag.className
		driver.findElement(By.linkText("Forgot your password?")).click();//linkankertag
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");//xpath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abhay@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rahul@gmail.com");//customXpby[order]
	//	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("cssBy[order]");//customCss[order]
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9862518526");//pTOc-xpath
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");//css-id
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//RegularExp->allow All passwords staring from "pass"
		driver.findElement(By.cssSelector("#chkboxOne")).click();//cssID
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();//RExp-xpath
		
		
		
	}

}
