package stepDefinations;



import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
public class stepDefination {

	 @Given("^User is on Yatra home Page$") public void
	  user_is_on_yatra_home_page() throws Throwable {

	     }
	 @When("^User login to yatra Page with Username and Password$") public void
	  user_login_to_yatra_page_with_username_and_password() throws Throwable {

	  }
	  @Then("^User should be able to Login$") public void
	  user_should_be_able_to_login() throws Throwable {

	  }
	 @And("^On the home page It desplayed as logged in user$") public void
	  on_the_home_page_it_desplayed_as_logged_in_user() throws Throwable {

	  }

	}


