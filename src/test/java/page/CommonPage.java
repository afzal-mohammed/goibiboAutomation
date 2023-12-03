package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonPage {

	WebDriver driver;

	CommonPage() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Java Workspace\\Goibibo_Automation\\src\\test\\resources\\driver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
