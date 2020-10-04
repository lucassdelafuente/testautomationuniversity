package brokenImage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BrokenImagesPage;

import static org.testng.Assert.assertTrue;

public class BrokenImageTest extends BaseTest {

    @Test
    public void checkBrokenImage(){
        BrokenImagesPage brokenImage = homePage.clickBrokenImage();
        brokenImage.countImgBroken();

        assertTrue(brokenImage.checkBroken(), "The Image is broken");
    }
}
