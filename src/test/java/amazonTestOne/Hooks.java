package amazonTestOne;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.BaseMain;

import java.io.IOException;


public class Hooks {
    BaseMain baseMain=new BaseMain();

    @Before
    public void setUpBrowser() throws IOException {
        baseMain.openBrowser();
    }
    @After
    public void tearDownBrowser(){
        baseMain.closeBrowser();
    }
}
