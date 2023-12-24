package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonPage {

	public LoginPage() {
		super(true);
	}

	public void launchBrowser() {

		driver.get("https://www.goibibo.com/flights/");

	}

	public void closeLoginPopup() {

		WebElement xButton = driver.findElement(By.xpath("//div[@data-id='auth-flow-section']//span[1]"));
		xButton.click();
	}

}
