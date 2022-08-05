package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserDriver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		browserDriver = new ChromeDriver();
		
		browserDriver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email= browserDriver.findElement(By.id("Email"));
		email.clear();
		
		WebElement password= browserDriver.findElement(By.id("Password"));
		password.clear();
		
		email.sendKeys("admin@yourstore.com");
		
		password.sendKeys("admin");
		
		WebElement button= browserDriver.findElement(By.className("button-1"));
				button.submit();
		
	}

}
