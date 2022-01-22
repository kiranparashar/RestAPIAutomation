package com.yatra;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import cucumber.api.java.en.Then;
public class ReqResSpecBuilder {
   public static void main(String args[]) {
	//1.create requestspecification and setbaseuri header all part those remain unchanged throughout the project.
	//2.  create response specification and expect the status code
	//3. split given when and then to requestSpecification   
	   RequestSpecification  req= new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").addHeader("Content-Type", "application/json").build();
	//   RestAssured.baseURI = "https://restful-booker.herokuapp.com";
	ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(200).build();
	   String payload= payloadforreqres.reqrespayloadmethod();
	  RequestSpecification res= given().spec(req)
	   .body(payload);
	  Response response= res.when().post("/auth")
			  .then().spec(resspec).extract().response();
	  
	  String responseString =response.asString();
	   System.out.println(responseString);
	         
	  //then().log().all().assertThat().statusCode(200).extract().asString();
		/*
		 * JsonPath js = new JsonPath(res); String tokenvalue= js.get("token");
		 * System.out.println("token value is .."+tokenvalue);
		 */
   
   }


}
