package stepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenTest {
	WebDriver driver = WhenTest.driver;
	@Then("User should be logged correctly")
	public void user_should_be_logged_correctly() {
		Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"));
		
	}
	
	
	@Then("User should see their payment and purchase information") //The program checks the header of the page and matches it with BANK-WIRE PAYMENT to confirm that all the steps were executed correctly and the test was successful
	public void user_should_see_their_payment_and_purchase_information() {
		WebElement lblHeading = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/h3"));
		Assert.assertTrue(lblHeading.getText().equals("BANK-WIRE PAYMENT."));
	}

}
