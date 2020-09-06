package exercises;

/*
For your optional independent exercise, go to our site, The Internet, and click on the Forgot Password link.

Enter an email address here. The email can be anything.

For example, “tau@example.com” so it doesn't have to be a real email address.

Click this Retrieve Password button and verify on this new page that you have this message saying, “Your e-mail's been sent!”.
 */

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPassPage;

import static org.testng.Assert.assertEquals;

public class ChapterFour extends BaseTest{

    @Test
    public void forgotPassword(){
        ForgotPassPage forgot = homePage.clickForgotPass();
        forgot.completeField("test@university.com");

        EmailSentPage email = forgot.clickRetrieve();

        assertEquals(email.getTextContent(),"Your e-mail's been sent!","Message is incorrect");

    }
}
