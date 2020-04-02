package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "email")
	WebElement emailLbl;
	
	@FindBy(id = "passwd")
	WebElement passwdLbl;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitBtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	WebElement accountHeader;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement womenBtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	WebElement fadedShirts;
	
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	WebElement cartButton;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement checkoutButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement checkoutButton1;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	WebElement checkoutButton2;
	
	@FindBy(xpath = "//*[@id=\"cgv\"]")
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	WebElement checkoutButton3;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement bankPaymentButton;
	
	public void sendEmail(String email) { //Inputs the email String
		emailLbl.sendKeys("test800@hotmail.com");
	}
	
	public void sendPass(String pass) { //Inputs the password String
		passwdLbl.sendKeys("test123");
	}
	
	public void clickSubmit() { //Clicks the submit button
		submitBtn.click();
	}
	
	public void accountHeaderCheck() { //Compares the page header with the String value to see if they match
		accountHeader.getText().equals("MY ACCOUNT");
	}
	
	public void clickWomen() { //Clicks the Women Button
		womenBtn.click();
	}
	
	public void clickShirts() { //Clicks the title of the faded shirts product
		fadedShirts.click();
	}
	
	public void clickCartBtn() { //Clicks the Add to cart button
		cartButton.click();
	}
	
	public void clickCheckoutBtn() { //Clicks the proceed to checkout button
		checkoutButton.click();
	}
	
	public void clickCheckoutBtn1() { //Clicks the proceed to checkout button
		checkoutButton1.click();
	}
	
	public void clickCheckoutBtn2() { //Clicks the proceed to checkout button
		checkoutButton2.click();
	}
	
	public void clickCheckbox() { //Clicks the Terms of Service checkbox
		checkbox.click();
	}
	
	public void clickCheckoutBtn3() { //Clicks the proceed to checkout button
		checkoutButton3.click();
	}
	
	public void clickBankPaymentButton() { //Clicks the pay by bank wire button
		bankPaymentButton.click();
	}

}
