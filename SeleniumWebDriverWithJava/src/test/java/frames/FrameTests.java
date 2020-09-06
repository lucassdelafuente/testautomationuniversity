package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest{

    @Test
    public void testWysiwyg(){
        WysiwygEditorPage editorPage = homePage.clickWysiwgEditor();
        editorPage.clearTextArea();

        String text1 = "hello";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "The frame text is incorrect");

    }
}
