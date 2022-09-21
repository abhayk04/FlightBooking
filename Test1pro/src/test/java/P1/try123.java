package P1;



public class try123 {

	public static void main(String[] args) {
		// TODO Js Alerts
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				String name1="Abhay";
			//	driver.findElement(By.id("name")).sendKeys(name1);

				//driver.findElement(By.id("alertbtn")).click();
				driver.findElement(By.id("confirmbtn")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().dismiss(); //Negative cancel , no etc
				// driver.switchTo().alert().accept(); //positive ok ,yes etc


	}

}
