package addRemoveElements;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AddRemovePage;

import static org.testng.Assert.assertFalse;

public class AddTests extends BaseTest {

    @Test
    public void testAddElement(){
        AddRemovePage addRemove = homePage.clickAddRemoveElements();
        addRemove.addElement(3);

        assertFalse(addRemove.validateRemoveElement(), "The remove element doesn't appear");
    }
}
