package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		        ChromeDriver browserDriver = new ChromeDriver();
		        browserDriver.get("http://www.google.com/");
		        browserDriver.close();
		
	}

}
