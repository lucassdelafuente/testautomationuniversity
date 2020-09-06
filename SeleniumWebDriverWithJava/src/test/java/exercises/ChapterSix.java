package exercises;

/* Click on the Horizontal Slider link the home page of The Internet site,
   You're going to sendKeys to this slider until it gets to the number 4. And then you'll verify that this text actually equals 4.

   To actually move this slider, you'll just need to send some arrow keys to the slider itself.

   So, send enough of those arrow keys to get to the number 4.
 */

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class ChapterSix extends BaseTest {

    @Test
    public void moveSliderToFour(){
        int value = 8;

        HorizontalSliderPage slider = homePage.clickHorizontalSlider();
        slider.moveSlider(value);

        assertEquals(slider.getRange(), "4", "The number in the slider is incorrect");
    }
}
