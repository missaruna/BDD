package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination_LoginPage {


@Given("I am in the login page")
public void i_am_in_the_login_page() {
 System.out.println("I am in Login page");
}

@When("I enter {string} and {string}")
public void i_enter_and(String string, String string2) {
	 System.out.println("I enter username"+ string+" and password "+ string2);
}

@When("select the login button")
public void select_the_login_button() {
	 System.out.println("I click on the login button");
}

@Then("I should land to search page")
public void i_should_land_to_search_page() {
	 System.out.println("I should be able to login and see the search page");
}


}

