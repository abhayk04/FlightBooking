package P1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Calenders 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//li/a[@value='BLR']
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//li/a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//select current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//checking if ui enabled or desabled //observe slight change in UI
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
	

	}

}
