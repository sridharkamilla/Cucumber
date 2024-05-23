package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.HelperClass;
import pages.HomePageHRM;
import pages.MenuTabs;

public class HRMLogin 

{
	WebDriver driver;
	HomePageHRM home;
	MenuTabs tabs;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public HRMLogin() 
	{
		HelperClass.setUpDriver();
		driver=HelperClass.getDriver();
		home=new HomePageHRM(driver);
		tabs=new MenuTabs(driver);
	}
	
	@Given("site address as hrm page")
	public void site_address_as_hrm_page() {
	   HelperClass.openPage(url);
	}

	
	@When("user enter valid username as {string}")
	public void user_enter_valid_username_as(String string) 
	{
	    home.typeusername(string);
	}
	@And("user enter valid password as {string}")
	public void user_enter_valid_password_as(String string)
	{
	   home.typepassword(string);
	}
	@And("user click on login button")
	public void user_click_on_login_button() 
	{
	    home.clickloginbutton();
	}
	@Then("Verify Admin tab displayed")
	public void verify_admin_tab_displayed() 
	{
	    tabs.waitforadmin();
	    Assert.assertTrue(tabs.admin.isDisplayed());
	
	}
	
	 @And("logout from HRM Application")
	 public void HRM_Logout()
	 {
		 if(driver!=null)
         {
              driver.close();
              driver.quit();
         }
		 
	 }


}
