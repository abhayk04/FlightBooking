package P1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class URL {

	public static void main(String[] args) {
		// TODO Selenium Auto Tests
		//Invoking Browser
		//chrome-ch21romedriver-webDmethods+PersonnelMethods
		//chromedriver.exe->Chrome browser
		//webdriver,chrome.driver->value of path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		//driver.getTitle(); //getTitle
		System.out.println(driver.getTitle());
		//driver.getCurrentUrl(); //getCurrentUrl
		System.out.println(driver.getCurrentUrl());
	//	driver.close();
		//driver.close(); //close original opened window
		//driver.quit(); //close all related windows

	}

}
