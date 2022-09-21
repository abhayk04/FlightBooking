package P1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes1 {

	public static void main(String[] args) {
		// TODO Assignment 1
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id=\"checkBoxOption1\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id=\"checkBoxOption1\"]")).isSelected());
		
		driver.findElement(By.cssSelector("input[id=\"checkBoxOption1\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id=\"checkBoxOption1\"]")).isSelected());
		
		 
	

	}

}
