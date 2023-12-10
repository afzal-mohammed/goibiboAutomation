package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.FlightPage;

public class FlightStep {

	FlightPage flightPage = new FlightPage();

	@When("user enters same location for from and to field for flight")
	public void user_enters_same_location_for_from_and_to_field() throws InterruptedException {
		flightPage.enterFromField();
		flightPage.enterToField();
	}

	@Then("error message should be displayed for same location")
	public void error_message_should_be_displayed_for_same_location() {
		Assert.assertTrue(flightPage.checkErrorMsgDisplayed());
		flightPage.closeBrowser();
	}
}
