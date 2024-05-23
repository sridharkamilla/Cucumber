package stepDefination;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestForLogin 
{
	
	
	@Given("site address as facebook")
	public void site_address_as_facebook() 
	{
	   System.out.println("Site is up and ready to use");
	}
	@When("user enter valid username")
	public void user_enter_valid_username() 
	{
		System.out.println("Valid Email Entry successful");
	}
	@When("user enter valid password")
	public void user_enter_valid_password() 
	{
	   System.out.println("Valid password entry succesful");
	}
	@When("click on login button")
	public void click_on_login_button() 
	{
		System.out.println("Login button clicked");
	}
	@Then("verify Logout is displayed")
	public void verify_logout_is_displayed() 
	{
	    System.out.println("Logout Button displayed");
	}
	
	@When("user enter invalid username")
	public void user_enter_invalid_username() 
	{
	  System.out.println("Invalid username Entered");
	}
	@When("user enter invalid password")
	public void user_enter_invalid_password() 
	{
	    System.out.println("Invalid Password Entered");
	}
	
	@Then("verify error message is displayed")
	public void verify_error_message_is_displayed() 
	{
	    System.out.println("Error message displayed");
	}
	
	

	@When("user leave password as blank")
	public void user_leave_password_as_blank() 
	{
	   System.out.println("Left password field is empty");
	}
	@Then("verify password error message displayed")
	public void verify_password_error_message_displayed() {
	   System.out.println("Password error message displayed");
	}

	
	


}