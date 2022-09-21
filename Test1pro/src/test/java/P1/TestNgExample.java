package P1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNgExample {

	public static void main(String[] args) {
		// TODO TestNg Example Assert.assertTrue/false/Equals
		// TODO Check boxes and all about it
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	//	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	//	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

//counting the checkbox // .size() give counts
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size() , 6);
		//driver.findElements(By.cssSelector("input[type='checkbox']")).size(); //expected is 6 
		//use " " to compare string and only num when comparing with nums


	}

}
