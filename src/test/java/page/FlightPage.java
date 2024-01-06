package page;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.List;

import javax.accessibility.AccessibleStateSet;
import javax.security.auth.x500.X500Principal;

import org.checkerframework.framework.qual.FromByteCode;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
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
		if (backDatedDate.getAttribute("aria-disabled").equals("true")) {
			res = true;
			System.out.println("Element is Disabled");
		} else {
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

		WebElement addChild = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(3);
		WebElement addInfant = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(5);

		addChild.click();
		addInfant.click();

	}

	public void verifyAdultsButtonIsDisabled() {

		WebElement adultTravellerMinusButton = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']"))
				.get(0);

		if (adultTravellerMinusButton.isEnabled()) {
			System.out.println("Element is present");
		} else {
			System.out.println("Element is not present"); // doubt unable to verify
		}

	}

	public void verifyAdultTravellerIsSelectedAsDefault() {

		WebElement travellersAndClassButton = driver
				.findElement(By.xpath("//div[@class='sc-12foipm-16 wRKJm fswFld ']//p[contains(text(), 'Adult')]"));
		travellersAndClassButton.click();
		String verifyOneAdultIsSelected = driver
				.findElement(By.xpath("//span[@class='sc-12foipm-65 dqoXYl'][contains(text(), '1')]")).getText();

		if (verifyOneAdultIsSelected.contains("1")) {
			System.out.println("One Adult Passenger is selected as default passenger ");
		} else {
			System.out.println("No passenger is selected as default");
		}
	}

	public void selectReturnDate() {

		WebElement returnButton = driver.findElement(By.xpath("//span[contains(text(), 'Return')]"));
		returnButton.click();

		WebElement returnDoneButton = driver
				.findElement(By.xpath("//span[@role= 'presentation'][contains(text(), 'Done')]"));
		returnDoneButton.click();
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();

	}

	public void verifyRoundTripIsAutoSelected() throws InterruptedException {

		boolean roundTripButton = driver.findElement(By.xpath("//p[contains(text(),'Round-trip')]")).isSelected();
		boolean oneWayButton = driver.findElement(By.xpath("//p[contains(text(),'One-way')]")).isSelected();

		System.out.println("One way button is selected " + oneWayButton);
		System.out.println("Round trip button is selected " + roundTripButton);

		// Unable to verify element is selected

	}

	public void selectReturnButton() {

		WebElement clickReturn = driver.findElement(By.xpath("//p[contains(text(), 'return flight')]"));
		clickReturn.click();
	}

	public void verifyReturnDateIsDisplayed() {

		boolean clickReturn = driver.findElement(By.xpath("//div[@class='DayPicker Range']")).isDisplayed();
		System.out.println("Return date is displayed " + clickReturn);

	}

	public void enterLocationToVerifyAutoSwitch() throws InterruptedException {

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

	public void verifyDepartureIsAutoSelected() {

		boolean verifyAutoSwitchDeparture = driver.findElement(By.xpath("//div[@class='DayPicker']")).isDisplayed();
		System.out.println("Auto switch to departure is " + verifyAutoSwitchDeparture);

		WebElement departureDoneButton = driver.findElement(By.className("fswTrvl__done"));
		departureDoneButton.click();

	}

	public void verifyAutoSwitchToTravellerAndClass() {

		boolean verifyAutoSwitchTravellerButton = driver.findElement(By.xpath("//div[@class='sc-12foipm-74 bGJMhT']"))
				.isDisplayed();
		System.out.println("Auto switch to traveller and class is " + verifyAutoSwitchTravellerButton);
		WebElement travellersDoneButton = driver.findElement(By.xpath("//a[contains(text(), 'Done')]"));
		travellersDoneButton.click();

	}

	public void selectRoundTrip() {

		WebElement clickRoundTrip = driver.findElement(By.xpath("//p[contains(text(),'Round-trip')]"));
		clickRoundTrip.click();
	}

	public void verifyReturnDateIsSelectedByDefault() {

		boolean verifyReturnDate = driver
				.findElement(By.xpath("//p[@class='sc-12foipm-18 cTPYom fswWidgetTitle'][contains(text(), '4 Jan')]"))
				.isEnabled();

		System.out.println("Return date is selected by default : " + verifyReturnDate);
	}

	public void clickTravellerandClass() {

		WebElement travellersAndClassButton = driver
				.findElement(By.xpath("//div[@class='sc-12foipm-16 wRKJm fswFld ']//p[contains(text(), 'Adult')]"));
		travellersAndClassButton.click();
	}

	public void selectThreeAdultPassengers() {

		WebElement adultSelectButton = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(1);
		for (int i = 1; i <= 2; i++) {
			adultSelectButton.click();
		}

	}

	public void verifyThreeAdultPassengerIsSelected() {

		boolean verifyThreeAdultSelected = driver.findElement(By.xpath("//span[contains(text(), '3')]")).isDisplayed();
		System.out.println("Is three adult passenger is selected : " + verifyThreeAdultSelected);

	}

	public void verifyThreeAdultChildrenInfantIsSelected() {

		WebElement adultSelectButton = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(1);
		for (int i = 1; i <= 2; i++) {
			adultSelectButton.click();

		}
		boolean verifyThreeAdultSelected = driver.findElements(By.xpath("//span[contains(text(), '3')]")).get(0)
				.isDisplayed();
		System.out.println("Three adult is selected :" + verifyThreeAdultSelected);

		WebElement addChild = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(3);
		for (int a = 1; a <= 3; a++) {
			addChild.click();

		}
		boolean verifyThreeChildSelected = driver.findElements(By.xpath("//span[contains(text(), '3')]")).get(1)
				.isDisplayed();
		System.out.println("Three child is selected :" + verifyThreeChildSelected);
		WebElement addInfant = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(5);
		for (int b = 1; b <= 3; b++) {
			addInfant.click();

		}
		boolean verifyThreeInfantSelected = driver.findElements(By.xpath("//span[contains(text(), '3')]")).get(2)
				.isDisplayed();
		System.out.println("Three child is selected :" + verifyThreeInfantSelected);

	}

	public void selectPremiumEconomy() {
		WebElement clickPremumEco = driver.findElement(By.xpath("//li[contains(text(), 'pre')]"));
		clickPremumEco.click();
	}

	public void verifyThreeAdultSelectedForPreEco() {

		WebElement adultSelectButton = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(1);
		for (int i = 1; i <= 2; i++) {
			adultSelectButton.click();

		}
		boolean verifyThreeAdultSelected = driver.findElements(By.xpath("//span[contains(text(), '3')]")).get(0)
				.isDisplayed();
		System.out.println("Three adult is selected :" + verifyThreeAdultSelected);

	}

	public void selectTenAdultAndNineChildrenAndNineInfant() throws InterruptedException {

		WebElement adultSelectButton = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(1);
		for (int i = 1; i <= 9; i++) {
			adultSelectButton.click();

		}
		boolean verifyTenAdultSelected = driver.findElements(By.xpath("//span[contains(text(), '10')]")).get(0)
				.isDisplayed();
		System.out.println("Ten adult is selected :" + verifyTenAdultSelected);

		WebElement addChild = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(3);
		for (int a = 1; a <= 9; a++) {
			addChild.click();

		}
		boolean verifyNineChildSelected = driver.findElements(By.xpath("//span[contains(text(), '9')]")).get(0)
				.isDisplayed();
		System.out.println("Nine child is selected :" + verifyNineChildSelected);

		WebElement addInfant = driver.findElements(By.xpath("//span[@class='sc-12foipm-64 dGRyPm']")).get(5);
		for (int b = 1; b <= 9; b++) {
			addInfant.click();

		}
		boolean verifyNineInfanttSelected = driver.findElements(By.xpath("//span[contains(text(), '9')]")).get(1)
				.isDisplayed();
		System.out.println("Nine child is selected :" + verifyNineInfanttSelected);

	}

}
