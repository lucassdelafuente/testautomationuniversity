package exercises;

/*
 * Go to the Context Menu link.
 * Click on it, and then on this box, do a context click, meaning a right click.
 * You'll need to use the Actions class in order to do this.
 * But once you do the right click, you see a pop-up here.
 * Verify that this text “You selected a context menu” is correct and click the “OK” button on the pop-up.
 * Once you do that, this context menu will appear. Don't worry about that.
 * As long as you verify the text and click the “OK” button, then your test is complete.
 */

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ChapterSeven extends BaseTest{

    @Test
    public void checkTextInModal(){
        ContextMenuPage context = homePage.clickContextMenu();
        context.clickOnBox();

        String text = context.textInModal();
        context.clickOnAcept();

        assertEquals(text, "You selected a context menu", "The message is incorrect");
    }
}
