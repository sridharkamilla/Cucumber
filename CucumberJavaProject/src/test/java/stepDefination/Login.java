package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login 
{


	@Given("user navigates to the website javatpoint.com")
	public void user_navigates_to_the_website_javatpoint_com() 
	{

		System.out.println("Navigates to site");

	}

	@And("there user logs in through Login Window by using Username as {string} and Password as {string}")
	public void there_user_logs_in_through_login_window_by_using_username_as_and_password_as(String string, String string2)
	{

		System.out.println("User enter username and PAssword");
	}

	@Then("login must be successful.")
	public void login_must_be_successful() 
	{

		System.out.println("Login succes and home page display");

	}

}
