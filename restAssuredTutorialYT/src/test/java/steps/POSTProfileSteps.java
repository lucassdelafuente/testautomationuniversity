package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import utilities.RestAssuredExtension;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class POSTProfileSteps {

    private static ResponseOptions<Response> response;

    @Given("I perform POST operation for {string}")
    public void iPerformPOSTOperationFor(String arg0) {
        BDDStyleMethod.PerformPOSTBodyParameter();
    }

    @Given("I perform POST operation for {string} with body")
    public void iPerformPOSTOperationForWithBody(String url, DataTable table) throws Throwable{

        List<List<String>> data = table.cells();

        //Set body
        HashMap<String, String> body = new HashMap<>();
        //And search the value in the Scenario's table (Row 1, Column 0)
        body.put("name", data.get(1).get(0));

        //PATH Params
        HashMap<String, String> pathParams = new HashMap<>();
        //And search the value in the Scenario's table (Row 1, Column 1)
        pathParams.put("profileNo", data.get(1).get(1));

        //Perform Post operation
        response = RestAssuredExtension.PostOpsWithBodyAndPathParams(url, pathParams, body);

    }

    @Given("I ensure to perform POST operation for {string} with body as")
    public void iEnsureToPerformPOSTOperationForWithBodyAs(String url, DataTable table) {

        List<List<String>> data = table.cells();

        Map<String, String> body = new HashMap<>();
        body.put("id", data.get(1).get(0));
        body.put("title", data.get(1).get(1));
        body.put("author", data.get(1).get(2));

        //Perform post operation
        RestAssuredExtension.PostOpsWithBody(url, body);
    }

    @And("I perform DELETE operation for {string}")
    public void iPerformDELETEOperationFor(String url, DataTable table) {

        List<List<String>> data = table.cells();

        Map<String, String> pathParameter = new HashMap<>();
        pathParameter.put("postid", data.get(1).get(0));

        //Perform delete operation
        RestAssuredExtension.DeleteOpsWithPathParams(url, pathParameter);
    }

    @And("I perform GET operation with path parameter for {string}")
    public void iPerformGETOperationWithPathParameterFor(String url, DataTable table) throws URISyntaxException {

        List<List<String>> data = table.cells();

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("postid", data.get(1).get(0));

        //Perform Get operation
        response = RestAssuredExtension.GetOpsWithPathParams(url, pathParams);
    }

    @And("I Perform PUT operation for {string}")
    public void iPerformPUTOperationFor(String url, DataTable table) throws Throwable{

        List<List<String>> data = table.cells();

        //Body
        Map<String, String> body = new HashMap<>();
        body.put("id", data.get(1).get(0));
        body.put("title", data.get(1).get(1));
        body.put("author", data.get(1).get(2));

        //PathParam
        Map<String, String> pathParam = new HashMap<>();
        pathParam.put("postid", data.get(1).get(0));

        //Perform Put operation
        RestAssuredExtension.PUTOpsWithBodyAndPathParams(url, body, pathParam);
    }

    @Then("I should see the body has name as {string}")
    public void iShouldSeeTheBodyHasNameAs(String name) {
        assertThat(response.getBody().jsonPath().get("name"), equalTo(name));
    }

    @Then("I {string} see the body with title as {string}")
    public void iShouldNotSeeTheBodyWithTitleAs(String conditions, String title) {
        if(conditions.equalsIgnoreCase("should not")){
            assertThat(response.getBody().jsonPath().get("title"), IsNot.not(title));
        }
        else{
            assertThat(response.getBody().jsonPath().get("title"), Is.is(title));
        }
    }

    @And("I should see that the status code is {int}")
    public void iShouldSeeThatTheStatusCodeIs(int statusCode) {
        //To StatusCode
        assertThat(response.getStatusCode(), Is.is(statusCode));
    }

}
