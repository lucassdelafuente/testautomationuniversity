package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.AssertJUnit.assertEquals;

public class KeysTests extends BaseTest{

    @Test(priority = 0)
    public void testBackSpace(){
      KeyPressesPage keyPage = homePage.clickKeyPresses();
      keyPage.enterText("A" + Keys.BACK_SPACE);

      assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test(priority = 1)
    public void testPi(){
      KeyPressesPage keyPage = homePage.clickKeyPresses();
      keyPage.enterPi();

      assertEquals(keyPage.getResult(), "You entered: 4");
    }

}
