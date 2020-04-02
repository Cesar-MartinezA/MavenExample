package apiStepDefinitions;

import org.testng.Assert;

import apiPageObjects.GetEmployees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


public class EmployeesStepDefinitions {
	Response response;
	GetEmployees employees;
	int id;
	@Given("User set valid auth key")
	public void user_set_valid_auth_key() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Correct Auth");
	}

	@When("User send a Get request on {string}")
	public void user_send_a_Get_request_on(String endPoint) {
	    // Write code here that turns the phrase above into concrete actions
	    employees = new GetEmployees(endPoint);
	}

	@Then("User should get status code {int}")
	public void user_should_get_status_code(Integer statusCode) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Response: " + employees.response.asString());
		Assert.assertTrue(employees.response.getStatusCode()== statusCode);
		
	}
	
	//Get single employee
	@Given("User send an id of {int}")
	public void user_send_an_id_of(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    this.id = int1;
	}


}
