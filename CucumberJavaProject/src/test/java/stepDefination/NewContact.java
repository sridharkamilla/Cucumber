package stepDefination;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NewContact 
{
	WebDriver driver;
	String url="https://classic.freecrm.com/index.html";
	
	
	@Given("^User is already on login page$")
	
	public void user_is_already_on_login_page()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	}

	//@Then("^User enters \"(.*)\" and \"(.*)\" $" )	
	//@Then("User enters {string} and {string}")    // ([^\"]*)
	
	@Then("User enters {string} and {string}") 
	public void user_enters_and(String username, String password) throws Exception
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(2000);
	}

	@Then("^User clicks on login button$")
	
	public void user_clicks_on_login_button() throws Exception
	{
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		Thread.sleep(2000);
	}

	@Then("^User is now on home page$")
	
	public void user_is_now_on_home_page() throws Exception
	{
		String Exp_title="CRMPRO";
		String Act_title=driver.getTitle();
		Assert.assertEquals(Act_title, Exp_title);
		Thread.sleep(3000);

	}

	@Then("^User moves to new contact page$")
	
	public void user_moves_to_new_contact_page() 
	{
		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(.,'New Contact')]")).click();

	}

	//@Then("^User enters new contact details \"(.*)\" and \"(.*)\" and \"(.*)\" $")
	
	@Then("User enters new contact details {string} and {string} and {string}")
	public void user_enters_new_contact_details(String firstname, String lastname,String position) throws Exception
	{
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(lastname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'position')]")).sendKeys(position);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(2000);
	}
	
	
	

	@Then("^Close the browser$")
	
	public void close_the_browser()
	{
		driver.close();
		driver.quit();

	}

	



}
