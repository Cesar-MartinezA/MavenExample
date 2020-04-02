package stepsDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import pageObjects.LogInPage;

public class GivenTest {
	LogInPage lg;
	public static WebDriver driver = SetUpClass.driver;
	
	@Given("User is on login page") //The program inputs the url of the login page of the website and maximizes the window
	public void user_is_on_login_page() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    driver.manage().window().maximize();
	    
	}
	
	@Given("User logs in correctly {string}, {string}") //The program inputs the email and password into their respective fields, and clicks the login button
	public void user_logs_in_correctly(String email, String password) {
		lg = new LogInPage(driver);
		lg.sendEmail(email);
		lg.sendPass(password);
		lg.clickSubmit();
	}
	
	@Given("User is logged in and on their account page") //The program checks the header of the page to verify the user successfully logged in to their account
	public void user_is_logged_in_and_on_their_account_page() {
		lg.accountHeaderCheck();
	}

}
