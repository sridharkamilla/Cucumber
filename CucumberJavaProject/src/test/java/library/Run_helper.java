package library;


import org.openqa.selenium.WebDriver;

public class Run_helper 
{
	public static void main(String[] args) 
	{
		HelperClass.setUpDriver();
		WebDriver driver=HelperClass.getDriver();
		System.out.println(driver);
	}
}
