package utilities;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/* Bill Wake => ARRANGE / ACT / ASSERT PATTERN (AAA)
* Dan North => Given  / When / Then           (GWD)
* automationpanda.com
  * Arrange inputs and targets. Arrange steps should set up the test case. Does the test require any objects or special
    settings? Does it need to prep a database? Does it need to log into a web app? Handle all of these operations at
    the start of the test.
  * Act on the target behavior. Act steps should cover the main thing to be tested. This could be calling a function or
    method, calling a REST API, or interacting with a web page. Keep actions focused on the target behavior.
  * Assert expected outcomes. Act steps should elicit some sort of response. Assert steps verify the goodness or badness
    of that response. Sometimes, assertions are as simple as checking numeric or string values. Other times, they may
    require checking multiple facets of a system. Assertions will ultimately determine if the test passes or fails.
 */
public class RestAssuredExtension {
    //ResponseOptions<> is an Interface

    // RequestSpecification: Mechanism that REST Assured offers to enable us to create flexible and reusable
    // requests specifications.
    public static RequestSpecification Request;

    //Arrange
    public RestAssuredExtension(){
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("http://localhost:3000");
        builder.setContentType(ContentType.JSON);

        RequestSpecification requestSpec = builder.build();

        Request = RestAssured.given().spec(requestSpec);
    }

    //ACT - GET

    //Act - To GET with Path Parameters
    public static void GetOpsWithPathParameters(String url, Map<String, String> pathParams) throws URISyntaxException {
        Request.pathParams(pathParams);

        try{
            Request.get(new URI(url));
        } catch(URISyntaxException e){
            e.printStackTrace();
        }

    }

    //Act - To Simple GET
    public static ResponseOptions<Response> GetOps(String url) throws URISyntaxException {
        try{
        Request.get(new URI(url));
        }catch(URISyntaxException e){
            e.printStackTrace();
        }
        return null;
    }

    //Act - GET With Token
    public static ResponseOptions<Response> GetOpsWithToken(String url, String token) throws URISyntaxException {
        try{
            //You can use the header(HEADER) or with (String, Objetc, etc)
            //It's more simple with de Header object
            Request.header(new Header("Authorization", "Bearer " + token));
            return Request.get(new URI(url));
        }catch(URISyntaxException e){
            e.printStackTrace();
        }
        return null;
    }

    //Act - To GET with token and Query Params
    public static ResponseOptions<Response> GetWithQueryParamsWithToken(String url, Map<String, String> queryParams, String token) {
        Request.header(new Header("Authorization", "Bearer"));
        Request.queryParams(queryParams);
        return Request.get(url);
    }

    //Act - To GET with Path Params
    public static ResponseOptions<Response> GetOpsWithPathParams(String url, Map<String, String> pathParams)  {
        Request.pathParams(pathParams);
        return Request.get(url);
    }

    //ACT POST

    //Act - To POST With BODY
    public static ResponseOptions<Response> PostOpsWithBody(String url, Map<String, String> body){
        Request.body(body);
        return Request.post(url);
    }

    //Act - To POST With BODY and PATH Parameters
    public static ResponseOptions<Response> PostOpsWithBodyAndPathParams(String url, Map<String, String> pathParams, Map<String, String> body) {

        Request.pathParams(pathParams);
        Request.body(body);
        //You can put .post(new URI(url)) or only a String
        return Request.post(url);
    }

    //ACT DELETE

    //Act - Delete with PATH Params
    public static ResponseOptions<Response> DeleteOpsWithPathParams(String url, Map<String, String> pathParams){
        Request.pathParams(pathParams);
        return Request.delete(url);
    }

    //ACT PUT

    //Act - PUT with Body
    public static ResponseOptions<Response> PUTOpsWithBodyAndPathParams(String url, Map<String, String> body, Map<String, String> pathParams) {
        Request.pathParams(pathParams);
        Request.body(body);
        return Request.put(url);
    }

    //ACT PATCH
}
