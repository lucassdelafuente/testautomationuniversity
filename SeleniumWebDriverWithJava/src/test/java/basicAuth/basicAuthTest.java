package basicAuth;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BasicAuthPage;
import pages.HomePage;

import static org.testng.AssertJUnit.assertEquals;

public class basicAuthTest extends BaseTest {

    @Test
    public void basicAuth(){
        BasicAuthPage basicAuth = homePage.clickBasicAuthPage();

        String message = "Congratulations! You must have the proper credentials.";

        basicAuth.completeUserAndPass("admin", "admin");
        basicAuth.sendForm();

        assertEquals(basicAuth.getTextCongrats(), message, "You are not logged in");
    }
}
