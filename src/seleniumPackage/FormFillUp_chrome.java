package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFillUp_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserDriver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		browserDriver = new ChromeDriver();
		
		browserDriver.get("http://training.qaonlinetraining.com/testPage.php");
		
		browserDriver.findElement(By.name("name")).sendKeys("Ronak");
		
		browserDriver.findElement(By.name("email")).sendKeys("xyz@123");
		
		browserDriver.findElement(By.name("website")).sendKeys("www.xyz.com");
		
		browserDriver.findElement(By.name("comment")).sendKeys("I am Learning");
		
		browserDriver.findElement(By.name("submit")).click();
	}

}
