package stepDefinition;

import io.cucumber.java.en.Given;
import page.LoginPage;

public class LoginStep {

	@Given("user launches goibibo website")
	public void user_launches_goibibo_website() {

		LoginPage lp = new LoginPage();

		lp.launchBrowser();
		lp.closeLoginPopup();

	}

}
