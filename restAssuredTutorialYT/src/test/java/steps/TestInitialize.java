package steps;

import io.cucumber.java.Before;
import utilities.RestAssuredExtension;

//Hooks
public class TestInitialize {

    @Before
    public void TestSetUp(){
        RestAssuredExtension restAssuredExtension = new RestAssuredExtension();
    }
}
