package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageHRM 
{
	WebDriver driver;
	public HomePageHRM(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	public WebElement loginbutton;
	
	public void waitforhomepage()
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(username));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void typeusername(String uid)
	{
		waitforhomepage();
		username.sendKeys(uid);
	}
	
	public void typepassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	public void userlogin(String uid,String pwd)
	{
		typeusername(uid);
		typepassword(pwd);
		clickloginbutton();
	}	

}