package stepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;
import pageObjects.LogInPage;

public class WhenTest {
	LogInPage lg;
	public static WebDriver driver = GivenTest.driver;
	
	
	@When("User clicks on the Women button") //The program clicks on the women button on the top bar to see the list of women's products
	public void user_clicks_on_the_women_button() {
		lg = new LogInPage(driver);
		lg.clickWomen();
	}
	
	@When("User clicks on the Faded Shirt image") //The program clicks on the title of the first women's product 
	public void user_clicks_on_the_faded_shirt_image() {
		lg.clickShirts();
	}
	
	@When("User clicks on Add to cart button") //The program clicks on the Add to cart button, adding the selected product to the cart
	public void user_clicks_on_add_to_cart_button() {
		lg.clickCartBtn();
	}
	
	@When("User clicks Proceed to checkout button") //The program clicks the proceed to checkout button to proceed with the purchasing process
	public void user_clicks_proceed_to_checkout_button() {
		lg.clickCheckoutBtn();
	}
	
	@When("User clicks Proceed to checkout button in the shopping cart summary page") //The program clicks the proceed to checkout button to move to the next step in the purchasing process
	public void user_clicks_proceed_to_checkout_button_in_the_shopping_cart_summary_page() {
		lg.clickCheckoutBtn1();
	}
	
	@When("User clicks Proceed to checkout button in the address page") //The program clicks the proceed to checkout button to move to the next step in the purchasing process
	public void user_clicks_proceed_to_checkout_button_in_the_address_page() {
		lg.clickCheckoutBtn2();
	}
	
	@When("User clicks on the Terms of Service checkbox") //The program clicks the Terms of Service checkbox
	public void user_clicks_on_the_terms_of_service_checkbox() {
		lg.clickCheckbox();
	}
	
	@When("User clicks Proceed to checkout button in the shipping page") //The program clicks the proceed to checkout button
	public void user_clicks_proceed_to_checkout_button_in_the_shipping_page() {
		lg.clickCheckoutBtn3();
	}
	
	@When("User clicks on Pay by bank wire button") //The program selects the payment option by clicking on the pay by bank wire option
	public void user_clicks_on_pay_by_bank_wire_button() {
		lg.clickBankPaymentButton();
	}
	

}
