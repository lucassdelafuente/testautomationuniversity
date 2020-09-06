package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    @Test
    public void getSelectOption(){
        DropDownPage dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);

        List<String> selectedOptions = dropDownPage.getSelectedOptions();

        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }

    @Test
    public void selectOptionsJS(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectBothOptions();

        List<String> optionsToSelect = Arrays.asList("Option 1", "Option 2");
        //JAVA 9 > var optionsToSelect = List.of("Option 1", "Option 2");

        //For each
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
