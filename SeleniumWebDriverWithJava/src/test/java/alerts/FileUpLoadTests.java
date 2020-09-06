package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUpLoadPage;

import static org.testng.Assert.assertEquals;

public class FileUpLoadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        FileUpLoadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/Luquitas/IdeaProjects/testautomationu/webdriver_java/resources/chromedriver");

        assertEquals(uploadPage.getUploadFiles(), "chromedriver", "Uploaded is incorrect");
    }
}
