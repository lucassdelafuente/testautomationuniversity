package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTest{

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowsManager().goBack();
        getWindowsManager().goForward();
        getWindowsManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowsManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchTabAssert(){
        DynamicLoadingExample2Page dynamic = homePage.clickDynamicLoading().rightClick();
        getWindowsManager().switchToOtherTab();

        assertTrue(dynamic.startButtonIsDisplayed(), "The element isn't present");

    }
}
