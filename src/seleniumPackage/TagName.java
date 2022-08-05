package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserDriver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		browserDriver = new ChromeDriver();
		
		browserDriver.get("https://www.itlearn360.com/");
		
		int count= 0;
		
		List<WebElement> allLinks = browserDriver.findElements(By.tagName("a"));
		for (WebElement link : allLinks) {
			System.out.println(link.getAttribute("href"));
			count++;
			}
		
		System.out.println("Total Number of Links Present " +count);
		
		browserDriver.close();
	}

}
