import org.json.JSONObject;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class RestAssuredTest {
	public Response response;
	public RequestSpecification request;
	
	@BeforeTest()
	public void setUp() {
		RestAssured.baseURI = "https://reqres.in/api/";
		request=RestAssured.given();
	}
	
	@Test(enabled = false)
	public void test1() {
		response = request
				.given()
				.when()
				.get("users");
		
		System.out.println(response.asString());
	}
	
	@Test(enabled = false)
	public void test2() {
		response = request
				.given()
				.pathParam("id", 1)
				.when()
				.get("users/{id}");			
		
		response.then().statusCode(200);
		
		System.out.println(response.prettyPrint());
	}
	
	@Test()
	public void test3() {
		
		JSONObject json = new JSONObject();
		
		json.put("name", "Cesar");
		json.put("job", "QE");
		String jsonString = json.toString();
		
		response = request
				.given()
				.contentType(ContentType.JSON)
				.body(jsonString)
				.when()
				.post("users");		
		
		response.then().statusCode(201);
		
		System.out.println(response.prettyPrint());
	}
	
	@Test()
	public void test4() {
		response = request
				.given()
				.pathParam("id", 676)
				.when()
				.get("users/{id}");			
		
		response.then().statusCode(200);
		
		System.out.println(response.prettyPrint());
	}
	
	@Test()
	public void test5() {
		
		JSONObject json = new JSONObject();
		
		json.put("name", "Cesar");
		json.put("job", "Alumno");
		String jsonString = json.toString();
		
		response = request
				.given()
				.pathParam("id", 676)
				.contentType(ContentType.JSON)
				.body(jsonString)
				.when()
				.put("users/{id}");		
		
		response.then().statusCode(200);
		
		System.out.println(response.prettyPrint());
	}
	
	@Test()
	public void test6() {
		
		response = request
				.given()
				.pathParam("id", 676)
				.when()
				.delete("users/{id}");		
		
		response.then().statusCode(204);
		
		System.out.println(response.prettyPrint());
	}
}

