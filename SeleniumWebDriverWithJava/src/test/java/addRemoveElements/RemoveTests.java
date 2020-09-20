package addRemoveElements;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AddRemovePage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RemoveTests extends BaseTest {

    @Test
    public void testRemoveAllElements(){
        AddRemovePage addRemove = homePage.clickAddRemoveElements();
        //You can send the number of clicks by parameter
        addRemove.addElement(1);
        addRemove.removeElement(1);

        assertTrue(addRemove.validateRemoveElement(), "The Remove element is present");
    }

    @Test
    public void testRemoveSomeElements(){
        AddRemovePage addRemove = homePage.clickAddRemoveElements();
        addRemove.addElement(3);
        addRemove.removeElement(2);

        //In this case is False because the idea is not to delete all the elements
        assertFalse(addRemove.validateRemoveElement(), "The Remove element isn't present");
    }
}
