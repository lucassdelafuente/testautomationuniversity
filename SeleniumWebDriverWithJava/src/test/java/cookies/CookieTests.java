package cookies;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utils.CookieManager;

import static org.testng.Assert.assertTrue;

public class CookieTests extends BaseTest{

    @Test
    public void deleteCookie(){
        //deleteCookie("optimizelyBuckets");
        CookieManager cookieManager =  getCookieManager();

        Cookie cookie = cookieManager.setCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);

        assertTrue(cookieManager.isCookiePresent(cookie), "The cookie is present");
    }
}
