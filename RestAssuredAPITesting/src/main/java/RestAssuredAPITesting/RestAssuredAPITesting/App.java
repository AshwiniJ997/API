package RestAssuredAPITesting.RestAssuredAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
	 public void GetUserDetails()
	 {   
	 // base URI
	 RestAssured.baseURI = "https://reqres.in";
	 
	 // request
	 RequestSpecification httpRequest = RestAssured.given();
	 
	 // response
	 Response response = httpRequest.request(Method.GET, "/api/users?page=2");
	 
	 // printing the response
	 String responseBody = response.getBody().asString();
	 System.out.println("Response Body is =>  " + responseBody);
	 
	// Assert.assertEquals(responseBody.getStatusCode(), expected:200);
	 }
  /*  public static void main( String[] args )
    {
        System.out.println( "Hello World!!!!!" );
    }*/
}
