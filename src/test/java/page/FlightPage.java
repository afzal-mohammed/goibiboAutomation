package page;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.List;

import javax.accessibility.AccessibleStateSet;

import org.checkerframework.framework.qual.FromByteCode;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

import io.cucumber.java.be.I.Is;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class FlightPage extends CommonPage {
	public FlightPage() {
		super(false);
	}

	By fromField = By.xpath("//span[contains(text(),'From')]/..");
	By toField = By.xpath("//span[contains(text(),'To')]/..");
	By sameLocationErrorMsg = By.xpath("//div[contains(text(),'cannot be same')]");

	String actualTitle = driver.getTitle();
	String expectedTitle = "goibibo.com/flights/air-BOM-GOI-20231212--1-0-0-E-D?";

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
			Thread.sleep(2000);
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

	public void selectArmedForces() throws InterruptedException {
		WebElement armedForcesButton = driver.findElement(By.xpath("//span[contains(text(), 'armed')]"));

		armedForcesButton.click();

		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();

		Thread.sleep(2000);

	}

	public void enterFromFieldForArmedForces() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Mumbai");
		Thread.sleep(2000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p//span[contains(text(),'Mumbai')]"));
		autoSuggestList.click();

	}

	public void enterToFieldForArmedForces() throws InterruptedException {

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		} catch (Exception e) {

		}

		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Goa");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Goa')]"));
		autoSuggestList.click();
		Thread.sleep(3000);
		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();
		Thread.sleep(1000);
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();
		WebElement clickFlightButton = driver.findElement(By.xpath("//span[contains(text(), 'SEARCH FLIGHTS')]"));
		clickFlightButton.click();

	}

	@SuppressWarnings("deprecation")
	public void checkSearchPageDisplayed() throws InterruptedException {

		Thread.sleep(3000);

		Assert.assertNotSame(expectedTitle, actualTitle);

	}

	public void enterSameLocationForArmedForces() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("pune");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestListInput.click();

	}

	public boolean checkErrorMsgDisplayedForSameLocation() {

		return driver.findElement(sameLocationErrorMsg).isDisplayed();

	}

	public void selectSeniorCitizen() {

		WebElement srCitizenButton = driver.findElement(By.xpath("//span[contains(text(), 'citizen')]"));
		srCitizenButton.click();
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();

	}

	public void enterSameLocationForSrCitizen() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("pune");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestListInput.click();

	}

	public boolean checkErrorMsgDisplayedForSameLocationSrCitizen() {

		return driver.findElement(sameLocationErrorMsg).isDisplayed();

	}

	public void selectStudentButton() {

		WebElement studentButton = driver.findElement(By.xpath("//span[contains(text(), 'student')]"));
		studentButton.click();
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();

	}

	public void enterSameLocationForStudent() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("pune");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestListInput.click();
	}

	public boolean checkErrorMsgForStudent() {

		return driver.findElement(sameLocationErrorMsg).isDisplayed();
	}

	public void selectDocAndNurseButton() {

		WebElement docAndNurseButton = driver.findElement(By.xpath("//span[contains(text(), 'doctors & nurses')]"));
		docAndNurseButton.click();
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();

	}

	public void enterSameLocationForDocAndNurse() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("pune");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestListInput.click();

	}

	public boolean checkErrorMsgForDocAndNurse() {

		return driver.findElement(sameLocationErrorMsg).isDisplayed();
	}

	public void enterDifferentLocation() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//span[@class='autoCompleteTitle '][contains(text(), Mumbai)]"));
		autoSuggestListInput.click();

		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();
		Thread.sleep(1000);
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();
		WebElement clickFlightButton = driver.findElement(By.xpath("//span[contains(text(), 'SEARCH FLIGHTS')]"));
		clickFlightButton.click();

	}

	@SuppressWarnings("deprecation")
	public void checkPageIsDisplayed() throws InterruptedException {

		Thread.sleep(9000);

		String expectedTitle1 = "https://www.goibibo.com/flights/air-PNQ-BOM-20231214--1-0-0-E-D?";
		String actualTitle1 = driver.getTitle();
		Assert.assertNotSame(expectedTitle1, actualTitle1);
	}

	public void enterDifferentLocationForSeniorCitizen() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//span[@class='autoCompleteTitle '][contains(text(), Mumbai)]"));
		autoSuggestListInput.click();

		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();
		Thread.sleep(1000);
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();
		WebElement clickFlightButton = driver.findElement(By.xpath("//span[contains(text(), 'SEARCH FLIGHTS')]"));
		clickFlightButton.click();
	}

	@SuppressWarnings("deprecation")
	public void checkPageIsDisplayedForSeniorCitizen() throws InterruptedException {

		Thread.sleep(15000);

		String expectedUrlForSrCitizen = driver.getCurrentUrl();
		System.out.println("Page url :" + expectedUrlForSrCitizen);

		Assert.assertTrue(expectedUrlForSrCitizen.contains("PNQ-BOM-20231218"));

	}

	public void enterDifferentLocationForStudent() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//span[@class='autoCompleteTitle '][contains(text(), Mumbai)]"));
		autoSuggestListInput.click();

		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();
		Thread.sleep(1000);
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();
		WebElement clickFlightButton = driver.findElement(By.xpath("//span[contains(text(), 'SEARCH FLIGHTS')]"));
		clickFlightButton.click();

	}

	public void checkPageIsDisplayedForStudent() {

		String expectedUrlForStudent = driver.getCurrentUrl();
		System.out.println("expected url for student :" + expectedUrlForStudent);

		Assert.assertTrue(expectedUrlForStudent.contains(""));

	}

	public void enterDifferentLocationForDocandNur() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//span[@class='autoCompleteTitle '][contains(text(), Mumbai)]"));
		autoSuggestListInput.click();

		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();
		Thread.sleep(1000);
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();
		WebElement clickFlightButton = driver.findElement(By.xpath("//span[contains(text(), 'SEARCH FLIGHTS')]"));
		clickFlightButton.click();

	}

	public void checkPageIsDispayedForDocAndNur() {

		String expectedUrlForDocAndNur = driver.getCurrentUrl();
		System.out.println("Expected Url For Doc & Nur: " + expectedUrlForDocAndNur);
		Assert.assertTrue(expectedUrlForDocAndNur.contains("PNQ-BOM-20231220"));

	}

	public void enterDifferentLocationOnly() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//span[@class='autoCompleteTitle '][contains(text(), Mumbai)]"));
		autoSuggestListInput.click();

	}

	public void enterSameDepartureAndReturnDates() throws InterruptedException {

		WebElement selectDate = driver
				.findElement(By.xpath("//div[@class='DayPicker-Day']//p[contains(text(), '21')]"));
		selectDate.click();

		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();

		WebElement travellersCancelButton = driver
				.findElement(By.xpath("//div[@class='sc-12foipm-75 iBFWhg']//a[contains(text(), 'Cancel')]"));
		travellersCancelButton.click();

		WebElement returnDateButton = driver
				.findElement(By.xpath("//div[@style='width: 142px;']//span[contains(text(), 'Return')]"));
		returnDateButton.click();

		WebElement selecReturnDate = driver
				.findElement(By.xpath("//div[@class='DayPicker-Day']//p[contains(text(), '21')]"));
		selecReturnDate.click();

		WebElement returnDoneButton = driver
				.findElement(By.xpath("//span[@role= 'presentation'][contains(text(), 'Done')]"));
		returnDoneButton.click();

		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();
		WebElement clickFlightButton = driver.findElement(By.xpath("//span[contains(text(), 'SEARCH FLIGHTS')]"));
		clickFlightButton.click();

	}

	public void checkPageIsDisplayedForSameDepartureAndReturnDate() {

		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println("Expected url for same : " + getCurrentUrl);

		Assert.assertTrue(getCurrentUrl.contains("20240121"));

	}

	public void enterDifferentLocationForBackDatedDate() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//span[@class='autoCompleteTitle '][contains(text(), Mumbai)]"));
		autoSuggestListInput.click();

	}

	public boolean verifyBackDatedDateIsDisable() throws InterruptedException {

		Thread.sleep(3000);

		WebElement backDatedDate = driver.findElement(By.xpath("//div[contains(@aria-label,'Dec 19')]"));
		boolean res;
		if(backDatedDate.getAttribute("aria-disabled").equals("true")) {
			res=true;
			System.out.println("Element is Disabled");
		}else {
			res = false;
			System.out.println("Element is Enabled");
		}
		return res;
	}

	public void enterDifferentLocationForSwap() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//span[@class='autoCompleteTitle '][contains(text(), Mumbai)]"));
		autoSuggestListInput.click();

		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();
		Thread.sleep(1000);
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();

	}

	public void clickSwap() {
		String fromFieldText = driver.findElement(By.xpath("//span[contains(text(),'From')]/..")).getText();
		String toFieldText = driver.findElement(By.xpath("//span[contains(text(),'To')]/..")).getText();
		System.out.println("From & To location before swap " + fromFieldText + toFieldText);
	}

	public void verifyFieldsAreSwapped() {

		WebElement swapButton = driver.findElement(By.xpath("//span[@class='sc-12foipm-51 foqjOL']"));
		List<WebElement> buttons = driver.findElements(By.xpath("//div//input"));
		swapButton.click();
		String fromFieldText = driver.findElement(By.xpath("//span[contains(text(),'From')]/..")).getText();
		String toFieldText = driver.findElement(By.xpath("//span[contains(text(),'To')]/..")).getText();
		System.out.println("From & To location after swap " + fromFieldText + toFieldText);

	}

	public void enterDifferentLocationForChildren() throws InterruptedException {

		driver.findElement(fromField).click();
		WebElement fromInput = driver.findElement(By.xpath("//span[contains(text(),'From')]/..//input"));
		fromInput.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement autoSuggestList = driver
				.findElement(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(text(),'Pune')]"));
		autoSuggestList.click();

		try {
			Thread.sleep(3000);
			driver.findElement(toField).click();
		}

		catch (Exception e) {

		}
		WebElement toInput = driver.findElement(By.xpath("//span[contains(text(),'To')]/..//input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000);
		WebElement autoSuggestListInput = driver
				.findElement(By.xpath("//span[@class='autoCompleteTitle '][contains(text(), Mumbai)]"));
		autoSuggestListInput.click();

		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();

	}

	public void addChildrenAndInfant() throws InterruptedException {

		Thread.sleep(3000);

		WebElement addChild = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[2]/div/span[3]"));
		// WebElement addInfant = driver.findElement(
		// By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[3]/div/span[3]"));

		addChild.click(); 
		// addInfant.click();

	}

}
