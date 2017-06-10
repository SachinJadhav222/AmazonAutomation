package amazonTestOne;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.html.HTMLObjectElement;
import utility.BaseMain;
import utility.WebUtility;

import java.io.IOException;


public class SmokeTest {
    @Before
    public void openBrowser() throws IOException {
        BaseMain baseMain=new BaseMain();
        baseMain.openBrowser();
    }
    @After
    public void closeBrowser(){
        BaseMain baseMain=new BaseMain();
        baseMain.closeBrowser();
    }

    @Test
    public void signInTest(){
        HomePage homePage=new HomePage();
        WebUtility.sleepTime(2);
        homePage.click_SignIn_Button();

    }
    @Test
    public void assertHomePage(){
        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.assertHomePage("Amazon.co.uk"));
     //   homePage.signInPage();
    }
}
