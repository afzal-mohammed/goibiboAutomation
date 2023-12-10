package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class FlightPage extends CommonPage {
	public FlightPage() {
		super(false);
	}

	By fromField = By.xpath("//span[contains(text(),'From')]/..");
	By toField = By.xpath("//span[contains(text(),'To')]/..");
	By sameLocationErrorMsg = By.xpath("//div[contains(text(),'cannot be same')]");

	public void enterFromField() throws InterruptedException {
		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

	}

	public void enterToField() throws InterruptedException {
		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		} catch (Exception e) {

		}

		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

	}

	public boolean checkErrorMsgDisplayed() {

		return driver.findElement(sameLocationErrorMsg).isDisplayed();
	}

}
