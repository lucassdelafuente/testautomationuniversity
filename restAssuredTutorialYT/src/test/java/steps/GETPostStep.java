package steps;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import pojo.Address;
import pojo.Locations;
import pojo.Posts;
import utilities.RestAssuredExtension;

import javax.xml.crypto.Data;
import javax.xml.stream.Location;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class GETPostStep {

    private static ResponseOptions<Response> response;

    @Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String url) throws Throwable {
        //With Token
        response = RestAssuredExtension.GetOpsWithToken(url, response.getBody().jsonPath().get("access_token"));
    }

    @Given("I perform authentication operation for {string} with body")
    public void iPerformAuthenticationOperationForWithBody(String url, DataTable table) {

        List<List<String>> data = table.cells();

        Map<String, String> body = new HashMap<>();
        body.put("email", data.get(1).get(0));
        body.put("password", data.get(1).get(1));

        //To perform POST operation
        response = RestAssuredExtension.PostOpsWithBody(url, body);
    }

    @And("I perform GET operation with path parameter for address {string}")
    public void iPerformGETOperationWithPathParameterForAddress(String url, DataTable table) {

        List<List<String>> data = table.cells();

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("id", data.get(1).get(0));

        //response
        response = RestAssuredExtension.GetWithQueryParamsWithToken(url, queryParams,response.getBody().jsonPath().get("Access_token"));

    }

    @Then("I should see the author name as {string}")
    public void iShouldSeeTheAuthorNameAs(String authorName) throws Throwable {

        //Deserialization - You need to use ".as" Rest-Assured Method
        Posts posts = response.getBody().as(Posts.class);

        assertThat(posts.getAuthor(), equalTo(authorName));

        // Whitout Deserialization
        // assertThat(response.getBody().jsonPath().get("author"), hasItem(authorName));
    }

    @Then("I should see the author names")
    public void iShouldSeeTheAuthorNames() throws Throwable{
        BDDStyleMethod.PerformContainsCollection();
    }

    @Then("I should see verify GET Parameter with Path")
    public void iShouldSeeVerifyGETParameter() {
        BDDStyleMethod.PerformPathParameter();
    }

    @Then("I should see verify GET Parameter with Query")
    public void iShouldSeeVerifyGETParameterWithQuery() {
        BDDStyleMethod.PerformQueryParameter();
    }

    @Then("I should see the street name as {string} for the {string} address")
    public void iShouldSeeTheStreetNameAsForTheAddress(String streetName, String addressType) {

        //Location[] -> Because Location is an array in the JSON
        Locations[] location = response.getBody().as(Locations[].class);

        //Filter the address based on the type of address
        Address address = location[0].getAddress().stream().filter(x->x.getType().equalsIgnoreCase(addressType))
                                                            .findFirst().orElse(null);

        assertThat(address.getStreet(), equalTo(streetName));
    }

    //In this scenario I use the JSONSChema library and I created a file in target/classes with the Posts Json Schema
    @Then("I should see the author name as {string} with JSON validation")
    public void iShouldSeeTheAuthorNameAsWithJSONValidation(String arg0) {

        //Return the body as String
        String responseBody = response.getBody().asString();

        //Assert
        assertThat(responseBody, matchesJsonSchemaInClasspath("post.json"));
    }
}
