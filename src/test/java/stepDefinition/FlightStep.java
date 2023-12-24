package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.sql.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.FlightPage;

public class FlightStep {

	FlightPage flightPage = new FlightPage();

	@When("user enters same location for from and to field for flight") // TC01
	public void user_enters_same_location_for_from_and_to_field() throws InterruptedException {
		flightPage.enterFromField();
		flightPage.enterToField();
	}

	@Then("error message should be displayed for same location")
	public void error_message_should_be_displayed_for_same_location() {
		Assert.assertTrue(flightPage.checkErrorMsgDisplayed());
		flightPage.closeBrowser();
	}

	@When("user selects armed forces button") // TC07
	public void user_selects_armed_forces_button() throws InterruptedException {
		flightPage.selectArmedForces();
	}

	@And("enters from and to location")
	public void enters_from_and_to_location() throws InterruptedException {

		flightPage.enterFromFieldForArmedForces();
		flightPage.enterToFieldForArmedForces();

	}

	@Then("flights results should be dispayed")
	public void flights_results_should_be_dispayed() throws InterruptedException {

		flightPage.checkSearchPageDisplayed();
		flightPage.closeBrowser();

	}

	@When("entere same location in from and to fields") // TC02
	public void entere_same_location_in_from_and_to_fields() throws InterruptedException {

		flightPage.selectArmedForces();
		flightPage.enterSameLocationForArmedForces();

	}

	@Then("error mesages should be displayed")
	public void error_mesages_should_be_displayed() {

		Assert.assertTrue(flightPage.checkErrorMsgDisplayedForSameLocation());
		flightPage.closeBrowser();

	}

	@When("user selects senior citizen button") // TC03
	public void user_selects_senior_citizen_button() {
		flightPage.selectSeniorCitizen();
	}

	@When("enters same location in from and to fields")
	public void enters_same_location_in_from_and_to_fields() throws InterruptedException {
		flightPage.enterSameLocationForSrCitizen();

	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {

		Assert.assertTrue(flightPage.checkErrorMsgDisplayedForSameLocationSrCitizen());
		flightPage.closeBrowser();

	}

	@When("user selects student button") // TC04
	public void user_selects_student_button() {

		flightPage.selectStudentButton();

	}

	@And("enters same location in from and to fields for student")
	public void enters_same_location_in_from_and_to_fields_for_student() throws InterruptedException {

		flightPage.enterSameLocationForStudent();

	}

	@Then("error message should be displayed for student")
	public void error_message_should_be_displayed_for_student() {

		Assert.assertTrue(flightPage.checkErrorMsgForStudent());
		flightPage.closeBrowser();

	}

	@When("user selects doctor & nurses") // TC 05
	public void user_selects_doctor_nurses() {
		flightPage.selectDocAndNurseButton();

	}

	@And("enters same location in from and to fields for doctor & nurses")
	public void enters_same_location_in_from_and_to_fields_for_doctor_nurses() throws InterruptedException {
		flightPage.enterSameLocationForDocAndNurse();

	}

	@Then("error message should be displayed for doctor & nurses")
	public void error_message_should_be_displayed_for_doctor_nurses() {

		Assert.assertTrue(flightPage.checkErrorMsgForDocAndNurse());
		flightPage.closeBrowser();

	}

	@When("user selects different location in from and to fields") // TC 06
	public void user_selects_different_location_in_from_and_to_fields() throws InterruptedException {

		flightPage.enterDifferentLocation();

	}

	@Then("flight results should be displayed") // TC 08
	public void flight_results_should_be_displayed() throws InterruptedException {
		flightPage.checkPageIsDisplayed();
		flightPage.closeBrowser();
	}

	@When("user enters different location in from and to fields")
	public void user_enters_different_location_in_from_and_to_fields() throws InterruptedException {
		flightPage.enterDifferentLocationForSeniorCitizen();

	}

	@Then("flight results should be displayed for senior citizen")
	public void flight_results_should_be_displayed_for_senior_citizen() throws InterruptedException {
		flightPage.checkPageIsDisplayedForSeniorCitizen();
		flightPage.closeBrowser();

	}

	@When("enters different locaton in from and to fields") // TC 09
	public void enters_different_locaton_in_from_and_to_fields() throws InterruptedException {
		flightPage.enterDifferentLocationForStudent();

	}

	@Then("flights results should be displayed for students")
	public void flights_results_should_be_displayed_for_students() {

		flightPage.checkPageIsDisplayedForStudent();
		flightPage.closeBrowser();
	}

	@When("enters same different location in from and to fields for doctor & nurses") // TC 10
	public void enters_same_different_location_in_from_and_to_fields_for_doctor_nurses() throws InterruptedException {

		flightPage.enterDifferentLocationForDocandNur();

	}

	@Then("flights results should be displayed for doctor & nurses")
	public void flights_results_should_be_displayed_for_doctor_nurses() {
		flightPage.checkPageIsDispayedForDocAndNur();
		flightPage.closeBrowser();

	}

	@When("enters different location in from and to field") // TC 11
	public void enters_different_location_in_from_and_to_field() throws InterruptedException {
		flightPage.enterDifferentLocationOnly();

	}

	@And("selects same departure and return date")
	public void selects_same_departure_and_return_date() throws InterruptedException {
		flightPage.enterSameDepartureAndReturnDates();

	}

	@Then("flights results should be displayed")
	public void flights_results_should_be_displayed() {
		flightPage.checkPageIsDisplayedForSameDepartureAndReturnDate();
		flightPage.closeBrowser();

	}

	@When("user enters different location in from and to fields for back dated") // TC 12
	public void user_enters_different_location_in_from_and_to_fields_for_back_dated() throws InterruptedException {

		flightPage.enterDifferentLocationForBackDatedDate();

	}

	@Then("user should not able to select back dated dates")
	public void user_should_not_able_to_select_back_dated_dates() throws InterruptedException {
		Assert.assertTrue(flightPage.verifyBackDatedDateIsDisable());
		flightPage.closeBrowser();
	}

	@When("user enters different location in from and to fields for swap") // TC 13
	public void user_enters_different_location_in_from_and_to_fields_for_swap() throws InterruptedException {
		flightPage.enterDifferentLocationForSwap();
	}

	@And("click swap button")
	public void click_swap_button() {
		flightPage.clickSwap();

	}

	@Then("from and to location should be swapped")
	public void from_and_to_location_should_be_swapped() {
		flightPage.verifyFieldsAreSwapped();
		flightPage.closeBrowser();

	}

	@When("user enters different location in from and to fields for children") // TC 14
	public void user_enters_different_location_in_from_and_to_fields_for_children() throws InterruptedException {

		flightPage.enterDifferentLocationForChildren();

	}

	@And("selects children and infant as travellers")
	public void selects_children_and_infant_as_travellers() throws InterruptedException {

		flightPage.addChildrenAndInfant();

	}

	@Then("adult deselect button should be disabled")
	public void adult_deselect_button_should_be_disabled() {

	}

}
