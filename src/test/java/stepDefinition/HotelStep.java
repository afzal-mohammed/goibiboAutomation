package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HotelPage;

public class HotelStep {

	HotelPage hotelpage = new HotelPage();

	@Given("user launches goibibo website for hotel")
	public void user_launches_goibibo_website_for_hotel() {

		hotelpage.openGoibiboWebsiteForHotel();

	}

	@When("When enters where location")
	public void when_enters_where_location() throws InterruptedException {
		hotelpage.enterWhereLocation();
	}

	@Then("rooms should be displayed")
	public void rooms_should_be_displayed() {

		hotelpage.verifyHotelSearch();
		hotelpage.closeBrowser();

	}

}
